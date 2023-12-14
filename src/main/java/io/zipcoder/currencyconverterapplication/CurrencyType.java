package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.*;

public enum CurrencyType {
    AUSTRALIAN_DOLLAR(2.70),
    CANADIAN_DOLLAR(2.64),
    CHINESE_YR(13.84),
    EURO(1.88),
    FRANC(2.02),
    POUND(1.64),
    RINGGIT(8.94),
    RUPEE(136.64),
    SINGAPORE_DOLLAR(1.86),
    US_DOLLAR(2.0),
    UNIVERSAL_CURRENCY(1.0),
    YEN(231.68);

    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {
        if (currency instanceof AustralianDollar){
            return CurrencyType.AUSTRALIAN_DOLLAR;
        }
        if (currency instanceof CanadianDollar){
            return CurrencyType.CANADIAN_DOLLAR;
        }
        if (currency instanceof ChineseYR){
            return CurrencyType.CHINESE_YR;
        }
        if (currency instanceof Euro){
            return CurrencyType.EURO;
        }
        if (currency instanceof Franc){
            return CurrencyType.FRANC;
        }
        if (currency instanceof Pound){
            return CurrencyType.POUND;
        }
        if (currency instanceof Ringgit){
            return CurrencyType.RINGGIT;
        }
        if (currency instanceof Rupee){
            return CurrencyType.RUPEE;
        }
        if (currency instanceof SingaporeDollar){
            return CurrencyType.SINGAPORE_DOLLAR;
        }
        if (currency instanceof UniversalCurrency){
            return CurrencyType.UNIVERSAL_CURRENCY;
        }
        if (currency instanceof USDollar){
            return CurrencyType.US_DOLLAR;
        }
        if (currency instanceof Yen){
            return CurrencyType.YEN;
        }
        return null;
    }
}
