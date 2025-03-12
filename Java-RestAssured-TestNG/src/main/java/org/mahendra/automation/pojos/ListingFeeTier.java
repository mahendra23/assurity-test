package org.mahendra.automation.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListingFeeTier {

    @JsonProperty("MinimumTierPrice")
    private double MinimumTierPrice;

    @JsonProperty("FixedFee")
    private double FixedFee;

    // Getters and Setters
    public double getMinimumTierPrice() { return MinimumTierPrice; }
    public void setMinimumTierPrice(double minimumTierPrice) { this.MinimumTierPrice = minimumTierPrice; }

    public double getFixedFee() { return FixedFee; }
    public void setFixedFee(double fixedFee) { this.FixedFee = fixedFee; }
}
