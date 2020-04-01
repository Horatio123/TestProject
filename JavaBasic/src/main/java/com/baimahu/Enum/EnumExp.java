package com.baimahu.Enum;

public class EnumExp {
    public static void main(String[] args) {
        System.out.println(Mobile.HUAWEI);
        System.out.println(Mobile.APPLE.price);
        System.out.println();

        Mobile mobile[] = Mobile.values();
        for (Mobile m: mobile) {
            System.out.println(m.toString());
        }
        System.out.println();

        Mobile m = Mobile.OPPO;
        switch (m) {
            case OPPO: System.out.println("oppo"); break;
            case APPLE: System.out.println("apple"); break;
            case HUAWEI: System.out.println("hauwei"); break;
        }
    }
}

enum Mobile {
    APPLE(80), HUAWEI(90), OPPO(100);
    int price;
    Mobile(int p) {
        this.price = p;
        // System.out.println("mobile");
    }
}


//class Mobile {
//    static final Mobile APPLE = new Mobile();
//}