package com.example.android.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewsActivity extends AppCompatActivity {

    /**
     * URL for article data from the Guardian API dataset
     */
    private static final String GUARDIAN_REQUEST_URL = "http://content.guardianapis.com/environment?order-by=newest&api-key=d3787300-c41c-4d75-a322-5dd44c5bb024";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }
}
