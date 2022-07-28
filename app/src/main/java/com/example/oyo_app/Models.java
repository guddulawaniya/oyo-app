package com.example.oyo_app;

import android.media.Rating;

public class Models {

    String reviewusername,comment,date;
    int reviewimage;
    String rating;

    public Models(String reviewusername, String comment, String rating, String date, int reviewimage) {
        this.reviewusername = reviewusername;
        this.comment = comment;
        this.rating = rating;
        this.date = date;
        this.reviewimage = reviewimage;
    }

    public String getReviewusername() {
        return reviewusername;
    }

    public void setReviewusername(String reviewusername) {
        this.reviewusername = reviewusername;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getReviewimage() {
        return reviewimage;
    }

    public void setReviewimage(int reviewimage) {
        this.reviewimage = reviewimage;
    }

    int grideimage;

    int cityimage;
    String cityname;

    public Models(String cityname) {
        this.cityname = cityname;
    }

    public Models(int cityimage, String cityname) {
        this.cityimage = cityimage;
        this.cityname = cityname;
    }

    public int getCityimage() {
        return cityimage;
    }

    public void setCityimage(int cityimage) {
        this.cityimage = cityimage;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Models(int grideimage) {
        this.grideimage = grideimage;
    }

    public int getGrideimage() {
        return grideimage;
    }

    public void setGrideimage(int grideimage) {
        this.grideimage = grideimage;
    }
}
