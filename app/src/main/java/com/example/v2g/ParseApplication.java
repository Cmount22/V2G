package com.example.v2g;

import android.app.Application;

import com.parse.Parse;


public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tuyacJw891UzIJjpJ13IowGprt4Elbc89Zn7USKd")
                .clientKey("vikxKBN6Hq3c5FeH3KI7lN3ncn0TiBrtEI4CM3IE")
                .server("https://parseapi.back4app.com")
                .build());
    }   }