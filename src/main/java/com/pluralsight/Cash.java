package com.pluralsight;

import java.math.BigDecimal;

public class Cash extends Asset{
    private String description;
    private String dateAcquired;
    private BigDecimal originalCost;

    public Cash(String description, String dateAcquired, BigDecimal originalCost, String description1, String dateAcquired1, BigDecimal originalCost1) {
        super(description, dateAcquired, originalCost);
        this.description = description1;
        this.dateAcquired = dateAcquired1;
        this.originalCost = originalCost1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    // The general answer for any asset: it is worth what was paid for it.
    // A child class that knows better replaces this method with its own
    public BigDecimal getValue() {
        return originalCost;
    }
}
