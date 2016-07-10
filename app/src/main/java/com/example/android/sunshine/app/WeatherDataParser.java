package com.example.android.sunshine.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {
    public static double getMaxTempratureForDay(String weatherJsonStr, int dayIndex)
        throws JSONException{
            JSONObject weather = new JSONObject(weatherJsonStr);
            JSONArray days= weather.getJSONArray("list");
            JSONObject dayInfo = days.getJSONObject(dayIndex);
            JSONObject tempratureInfo = dayInfo.getJSONObject("temp");
            return tempratureInfo.getDouble("max");

        }


}
