package com.example.maciek.aplikacjapogodowa;

/**
 * Created by Maciek on 03.01.2018.
 */

public class Place {
    private String placeName;
    private int placeTemperature;
    private String placeInformation;
    public String getPlaceName()
    {
        return placeName;
    }
    public void setPlaceName(String name)
    {
        placeName=name;
    }
    public String getPlaceInformation()
    {
        return placeInformation;
    }
    public void setPlaceInformation(String inf)
    {
        placeInformation=inf;
    }
    public void setplaceTemperature(int temp)
    {
        placeTemperature=temp;
    }
    public int getPlaceTemperature()
    {
        return  placeTemperature;
    }

}
