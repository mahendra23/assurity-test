package org.mahendra.automation.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;

public class Category {

    @JsonProperty("CategoryId")
    private int CategoryId;

    @JsonProperty("Name")
    private String Name;

    @JsonProperty("Path")
    private String Path;

    @JsonProperty("CanListAuctions")
    private boolean CanListAuctions;

    @JsonProperty("CanListClassifieds")
    private boolean CanListClassifieds;

    @JsonProperty("CanRelist")
    private boolean CanRelist;

    @JsonProperty("LegalNotice")
    private String LegalNotice;

    @JsonProperty("DefaultDuration")
    private int DefaultDuration;

    @JsonProperty("AllowedDurations")
    private List<Integer> AllowedDurations;

    @JsonProperty("Fees")
    private Fees Fees;

    @JsonProperty("FreePhotoCount")
    private int FreePhotoCount;

    @JsonProperty("MaximumPhotoCount")
    private int MaximumPhotoCount;

    @JsonProperty("IsFreeToRelist")
    private boolean IsFreeToRelist;

    @JsonProperty("Promotions")
    private List<Promotion> Promotions;

    @JsonProperty("EmbeddedContentOptions")
    private List<String> EmbeddedContentOptions;

    @JsonProperty("MaximumTitleLength")
    private int MaximumTitleLength;

    @JsonProperty("AreaOfBusiness")
    private int AreaOfBusiness;

    @JsonProperty("DefaultRelistDuration")
    private int DefaultRelistDuration;

    @JsonProperty("CanUseCounterOffers")
    private boolean CanUseCounterOffers;

    // Getters and Setters
    public int getCategoryId() { return CategoryId; }
    public void setCategoryId(int categoryId) { this.CategoryId = categoryId; }

    public String getName() { return Name; }
    public void setName(String name) { this.Name = name; }

    public String getPath() { return Path; }
    public void setPath(String path) { this.Path = path; }

    public boolean isCanListAuctions() { return CanListAuctions; }
    public void setCanListAuctions(boolean canListAuctions) { this.CanListAuctions = canListAuctions; }

    public boolean isCanListClassifieds() { return CanListClassifieds; }
    public void setCanListClassifieds(boolean canListClassifieds) { this.CanListClassifieds = canListClassifieds; }

    public boolean isCanRelist() { return CanRelist; }
    public void setCanRelist(boolean canRelist) { this.CanRelist = canRelist; }

    public String getLegalNotice() { return LegalNotice; }
    public void setLegalNotice(String legalNotice) { this.LegalNotice = legalNotice; }

    public int getDefaultDuration() { return DefaultDuration; }
    public void setDefaultDuration(int defaultDuration) { this.DefaultDuration = defaultDuration; }

    public List<Integer> getAllowedDurations() { return AllowedDurations; }
    public void setAllowedDurations(List<Integer> allowedDurations) { this.AllowedDurations = allowedDurations; }

    public Fees getFees() { return Fees; }
    public void setFees(Fees fees) { this.Fees = fees; }

    public int getFreePhotoCount() { return FreePhotoCount; }
    public void setFreePhotoCount(int freePhotoCount) { this.FreePhotoCount = freePhotoCount; }

    public int getMaximumPhotoCount() { return MaximumPhotoCount; }
    public void setMaximumPhotoCount(int maximumPhotoCount) { this.MaximumPhotoCount = maximumPhotoCount; }

    public boolean isIsFreeToRelist() { return IsFreeToRelist; }
    public void setIsFreeToRelist(boolean isFreeToRelist) { this.IsFreeToRelist = isFreeToRelist; }

    public List<Promotion> getPromotions() { return Promotions; }
    public void setPromotions(List<Promotion> promotions) { this.Promotions = promotions; }
    public String getPromotionByName(String promotionName) {
        Optional<Promotion> filteredPromotion = this.getPromotions()
                .stream()
                .filter(p -> p.getName().equalsIgnoreCase(promotionName))
                .findFirst();
        return filteredPromotion.map(Promotion::getDescription).orElse(null);
    }

    public List<String> getEmbeddedContentOptions() { return EmbeddedContentOptions; }
    public void setEmbeddedContentOptions(List<String> embeddedContentOptions) { this.EmbeddedContentOptions = embeddedContentOptions; }

    public int getMaximumTitleLength() { return MaximumTitleLength; }
    public void setMaximumTitleLength(int maximumTitleLength) { this.MaximumTitleLength = maximumTitleLength; }

    public int getAreaOfBusiness() { return AreaOfBusiness; }
    public void setAreaOfBusiness(int areaOfBusiness) { this.AreaOfBusiness = areaOfBusiness; }

    public int getDefaultRelistDuration() { return DefaultRelistDuration; }
    public void setDefaultRelistDuration(int defaultRelistDuration) { this.DefaultRelistDuration = defaultRelistDuration; }

    public boolean isCanUseCounterOffers() { return CanUseCounterOffers; }
    public void setCanUseCounterOffers(boolean canUseCounterOffers) { this.CanUseCounterOffers = canUseCounterOffers; }
}
