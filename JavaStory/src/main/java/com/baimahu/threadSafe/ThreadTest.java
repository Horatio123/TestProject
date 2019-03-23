package com.baimahu.threadSafe;

public class ThreadTest {
    public static void main(String[] args){
        Customer customer = new Customer("junye");
        ThreadRun tr = new ThreadRun(customer);
        ThreadRun tr2 = new ThreadRun(new Customer("zhonglei"));
        tr.start();
        tr2.start();

    }
}

class Customer{
    private String cust;
    public Customer(String name){
        this.cust = name;
    }
    public String getName(){
        return this.cust;
    }
}

class BankAccount{
    static BankAccount bankAccount;
    static int repository = 100;
    static Customer customer;

    public void setCustomer(Customer cust){
        customer = cust;
    }
    public static BankAccount getBankAccount(Customer customer){
        if(bankAccount == null){
            bankAccount = new BankAccount();
        }
        bankAccount.setCustomer(customer);
        return bankAccount;
    }
    public synchronized void withDrawl(int drawl){

        try{
            System.out.println(customer.getName() + " request to withdrawl $" + drawl);
            if(repository >=drawl){
                repository -= drawl;
                System.out.println(customer.getName() +" has drawled $" + drawl);
            }else {
                System.out.println("no repository to withdrawl");
            }
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("current repository is $" + repository);
        System.out.println();
    }


}

class ThreadRun extends Thread {
    public Customer cust;
    public ThreadRun(Customer customer){
        this.cust = customer;
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            try{
                BankAccount account = BankAccount.getBankAccount(cust);
                account.withDrawl(20);
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}