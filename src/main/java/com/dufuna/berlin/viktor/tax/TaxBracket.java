package com.dufuna.berlin.viktor.tax;

public class TaxBracket {
    private long id;
    private double lowerBound;
    private double upperBound;
    private double rate;

    public TaxBracket(long id, double lowerBound, double upperBound, double rate) {
        this.id = id;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.rate = rate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(double lowerBound) {
        this.lowerBound = lowerBound;
    }

    public double getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(double upperBound) {
        this.upperBound = upperBound;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
