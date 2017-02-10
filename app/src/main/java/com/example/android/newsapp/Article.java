package com.example.android.newsapp;

/**
 * Created by Rebecca on 2/10/2017.
 * An {@link Article} object contains information related to a single news article.
 */

public class Article {

    /**
     * Web title of the article
     */
    private String mWebTitle;

    /**
     * Section of the article
     */
    private String mSectionName;

    /*
    * Website URL of the article
    */
    private String mUrl;

    /**
    * Constructs a new (@link Article) object.
    * @param title is the title of the article.
    * @param sectionName is the category of the article.
    * @param url is the website URL link to read the article
    */
    public Article(String title, String sectionName, String url) {
        mWebTitle = title;
        mSectionName = sectionName;
        mUrl = url;
    }

    /**
    * Returns the web title of the article
    */
    public String getWebTitle() {
        return mWebTitle;
    }

    /**
     * Returns the web title of the article
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the website URL link to read the article
     */
    public String getUrl() {
        return mUrl;
    }

}
