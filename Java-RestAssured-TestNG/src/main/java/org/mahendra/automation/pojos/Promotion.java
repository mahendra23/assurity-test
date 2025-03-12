package org.mahendra.automation.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Promotion {

    @JsonProperty("Id")
    private int Id;

    @JsonProperty("Name")
    private String Name;

    @JsonProperty("Description")
    private String Description;

    @JsonProperty("Price")
    private double Price;

    @JsonProperty("OriginalPrice")
    public double OriginalPrice;

    @JsonProperty("Recommended")
    public boolean Recommended;

    @JsonProperty("MinimumPhotoCount")
    private int MinimumPhotoCount;

    // Getters and Setters
    public int getId() { return Id; }
    public void setId(int id) { this.Id = id; }

    public String getName() { return Name; }
    public void setName(String name) { this.Name = name; }

    public String getDescription() { return Description; }
    public void setDescription(String description) { this.Description = description; }

    public double getPrice() { return Price; }
    public void setPrice(double price) { this.Price = price; }

    public double getOriginalPrice() { return OriginalPrice; }
    public void setOriginalPrice(double originalPrice) { this.OriginalPrice = originalPrice; }

    public boolean isRecommended() { return Recommended; }
    public void setRecommended(boolean recommended) { this.Recommended = recommended; }

    public int getMinimumPhotoCount() { return MinimumPhotoCount; }
    public void setMinimumPhotoCount(int minimumPhotoCount) { this.MinimumPhotoCount = minimumPhotoCount; }
}
