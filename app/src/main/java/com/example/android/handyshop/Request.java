package com.example.android.handyshop;

public class Request {
    private int userId;
    private String title;
    private String category;
    private String subCategory;
    private String description;

    public Request( int userId,String title, String category,String subCategory, String description){
        this.userId=userId;
        this.title=title;
        this.category=category;
        this.subCategory=subCategory;
        this.description=description;

}

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription () {
        return description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Request() {}
}
