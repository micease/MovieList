package com.example.movielist;

public class MovieTag {
    public int pic;
    public String name;
    public String date;
    public String summary;

    public MovieTag(int pic, String name, String date, String summary) {
        this.pic = pic;
        this.name = name;
        this.date = date;
        this.summary = summary;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
