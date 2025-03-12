package org.mahendra.automation.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Fees {

    @JsonProperty("Bundle")
    private double Bundle;

    @JsonProperty("EndDate")
    private double EndDate;

    @JsonProperty("Feature")
    private double Feature;

    @JsonProperty("Gallery")
    private double Gallery;

    @JsonProperty("Listing")
    private double Listing;

    @JsonProperty("Reserve")
    private double Reserve;

    @JsonProperty("Subtitle")
    private double Subtitle;

    @JsonProperty("TenDays")
    private double TenDays;

    @JsonProperty("ListingFeeTiers")
    private List<ListingFeeTier> ListingFeeTiers;

    @JsonProperty("SecondCategory")
    private double SecondCategory;

    // Getters and Setters
    public double getBundle() { return Bundle; }
    public void setBundle(double bundle) { this.Bundle = bundle; }

    public double getEndDate() { return EndDate; }
    public void setEndDate(double endDate) { this.EndDate = endDate; }

    public double getFeature() { return Feature; }
    public void setFeature(double feature) { this.Feature = feature; }

    public double getGallery() { return Gallery; }
    public void setGallery(double gallery) { this.Gallery = gallery; }

    public double getListing() { return Listing; }
    public void setListing(double listing) { this.Listing = listing; }

    public double getReserve() { return Reserve; }
    public void setReserve(double reserve) { this.Reserve = reserve; }

    public double getSubtitle() { return Subtitle; }
    public void setSubtitle(double subtitle) { this.Subtitle = subtitle; }

    public double getTenDays() { return TenDays; }
    public void setTenDays(double tenDays) { this.TenDays = tenDays; }

    public List<ListingFeeTier> getListingFeeTiers() { return ListingFeeTiers; }
    public void setListingFeeTiers(List<ListingFeeTier> listingFeeTiers) { this.ListingFeeTiers = listingFeeTiers; }

    public double getSecondCategory() { return SecondCategory; }
    public void setSecondCategory(double secondCategory) { this.SecondCategory = secondCategory; }
}

