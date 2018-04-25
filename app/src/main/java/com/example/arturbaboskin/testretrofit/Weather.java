package com.example.arturbaboskin.testretrofit;

import com.google.gson.annotations.SerializedName;

public class Weather {
    String date;
    @SerializedName("tod")
    String timeOfDay;
    String pressure;
    String temp;
    String cloud;

    @Override
    public String toString() {
        return new StringBuilder()
                .append(date)
                .append("\n")
                .append(timeOfDay)
                .append("\n")
                .append(pressure)
                .append("\n")
                .append(temp)
                .append("\n")
                .append(cloud)
                .toString();
    }
}
