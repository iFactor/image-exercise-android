package com.ifactorinc.imageexercise;

/**
 * Created by albertwold on 5/31/16.
 */
public class NewsItem {
    private String headline;
    private String summary;

    public NewsItem(String headline, String summary) {
        this.headline = headline;
        this.summary = summary;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
