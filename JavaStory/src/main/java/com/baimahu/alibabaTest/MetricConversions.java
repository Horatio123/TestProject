package com.baimahu.alibabaTest;

import java.util.ArrayList;
import java.util.List;

public class MetricConversions {
    public static void main(String[] args) {
        List<ExchangeRate> exchangeRates = new ArrayList<>();
        exchangeRates.add(new ExchangeRate("feet", "feet", 1));
        exchangeRates.add(new ExchangeRate("feet", "inches", 12));
        exchangeRates.add(new ExchangeRate("feet", "yard", 0.33333333));
        exchange(exchangeRates, "yard", "yard");
        exchange(exchangeRates, "feet", "yard");
        exchange(exchangeRates, "inches", "yard");
        exchange(exchangeRates, "inches", "feet");
        exchange(exchangeRates, "yard", "feet");
    }

    //搜索出sourceMetric和targetMetric相对与feet的转换比率，相除就是两者之间的转换比率
    public static void exchange(List<ExchangeRate> exchangeRates, String sourceMetric, String targetMetric) {
        double sourceRate = 0;
        double targetRate = 0;
        double Target2SourceRate;

        for (ExchangeRate exchangeRate: exchangeRates) {
            if (exchangeRate.getTargetMetric().equals(sourceMetric)) {
                sourceRate = exchangeRate.getRate();
            }
            if (exchangeRate.getTargetMetric().equals(targetMetric)) {
                targetRate = exchangeRate.getRate();
            }
        }

         Target2SourceRate = targetRate / sourceRate;

        System.out.println("1 " + sourceMetric + " is same as " + Target2SourceRate + " " + targetMetric);

    }
}
//ExchageRate可以记录每一种度量方式相对于feet的转换比率
class ExchangeRate {

    private String baseMetric;
    private String targetMetric;
    private double rate;

    public ExchangeRate(String baseMetric, String targetMetric, double rate) {
        this.baseMetric = baseMetric;
        this.targetMetric = targetMetric;
        this.rate = rate;
    }

    public String getBaseMetric() {
        return baseMetric;
    }

    public String getTargetMetric() {
        return targetMetric;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return baseMetric + "-" + targetMetric + ":" + rate;
    }
}


