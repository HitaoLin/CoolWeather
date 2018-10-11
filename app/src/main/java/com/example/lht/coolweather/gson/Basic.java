package com.example.lht.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LHT on 2018/8/23.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;


    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
