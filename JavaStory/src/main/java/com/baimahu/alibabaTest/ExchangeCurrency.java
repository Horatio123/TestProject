package com.baimahu.alibabaTest;

import java.util.ArrayList;
import java.util.List;

class ExchangeCurrency {
    public static void main(String[] args) {
        List<ExchangeRate> exchangeRates = new ArrayList<>();
        exchangeRates.add(new ExchangeRate("INR", "USD", 54.18));
        exchangeRates.add(new ExchangeRate("JPY", "USD", 99.13));
        exchangeRates.add(new ExchangeRate("CNY", "USD", 6.16));
        double rupees = exchange(exchangeRates, "USD", 500.0, "INR");
        System.out.println("500 USD is same as " + rupees + " INR");

    }

    public static double exchange(List<ExchangeRate> exchangeRates, String sourceCurrency, double amount, String targetCurrency) {
        double sourceRate = 0;
        double targetRate = 0;
        double exchangeAmount;

        if (sourceCurrency.equals("USD")) {
            sourceRate = 1;
        } else {
            for (ExchangeRate exchangeRate: exchangeRates) {
                if (exchangeRate.targetCurrency.equals(sourceCurrency)) {
                    sourceRate = exchangeRate.rate;
                }
            }

        }

        if (targetCurrency.equals("USD")) {
            targetRate = 1;
        } else {
            for (ExchangeRate exchangeRate: exchangeRates) {
                if (exchangeRate.targetCurrency.equals(targetCurrency)) {
                    targetRate = exchangeRate.rate;
                }
            }

        }
        exchangeAmount = amount / sourceRate * targetRate;

        return exchangeAmount;
    }
    static class ExchangeRate {

        String targetCurrency;
        String baseCurrency;
        double rate;

        public ExchangeRate(String targetCurrency, String baseCurrency, double rate) {
            this.targetCurrency = targetCurrency;
            this.baseCurrency = baseCurrency;
            this.rate = rate;
        }

        @Override
        public String toString() {
            return targetCurrency + "-" + baseCurrency + ":" + rate;
        }
    }

}
