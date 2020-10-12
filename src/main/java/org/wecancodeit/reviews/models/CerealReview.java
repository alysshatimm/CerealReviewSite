package org.wecancodeit.reviews.models;

import org.wecancodeit.reviews.models.CerealCategory;

public class CerealReview {
    private CerealCategory category;
    private String cerealName;
    private String boxImage;
    private String nutritionImage;
    private String description;
    private String review;
    private String hashTag;



    public CerealReview(CerealCategory category, String cerealName, String boxImage, String nutritionImage, String description, String review, String hashTag, long id) {
        this.category = category;
        this.cerealName = cerealName;
        this.boxImage = boxImage;
        this.nutritionImage = nutritionImage;
        this.description = description;
        this.review = review;
        this.hashTag = hashTag;

    }

    public CerealCategory getCategory() {
        return category;
    }

    public String getCerealName() {
        return cerealName;
    }

    public String getBoxImage() {
        return boxImage;
    }

    public String getNutritionImage() {
        return nutritionImage;
    }

    public String getDescription() {
        return description;
    }

    public String getReview() {
        return review;
    }

    public String getHashTag() {
        return hashTag;
    }



}


