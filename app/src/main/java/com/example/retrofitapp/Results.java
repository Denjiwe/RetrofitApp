
package com.example.retrofitapp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results {

    @SerializedName("temp")
    @Expose
    private Integer temp;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("condition_code")
    @Expose
    private String conditionCode;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("currently")
    @Expose
    private String currently;
    @SerializedName("cid")
    @Expose
    private String cid;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("img_id")
    @Expose
    private String imgId;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("cloudiness")
    @Expose
    private Double cloudiness;
    @SerializedName("rain")
    @Expose
    private Double rain;
    @SerializedName("wind_speedy")
    @Expose
    private String windSpeedy;
    @SerializedName("wind_direction")
    @Expose
    private Integer windDirection;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("condition_slug")
    @Expose
    private String conditionSlug;
    @SerializedName("city_name")
    @Expose
    private String cityName;
    @SerializedName("forecast")
    @Expose
    private List<Forecast> forecast = null;
    @SerializedName("cref")
    @Expose
    private String cref;

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getConditionCode() {
        return conditionCode;
    }

    public void setConditionCode(String conditionCode) {
        this.conditionCode = conditionCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrently() {
        return currently;
    }

    public void setCurrently(String currently) {
        this.currently = currently;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(Double cloudiness) {
        this.cloudiness = cloudiness;
    }

    public Double getRain() {
        return rain;
    }

    public void setRain(Double rain) {
        this.rain = rain;
    }

    public String getWindSpeedy() {
        return windSpeedy;
    }

    public void setWindSpeedy(String windSpeedy) {
        this.windSpeedy = windSpeedy;
    }

    public Integer getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Integer windDirection) {
        this.windDirection = windDirection;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getConditionSlug() {
        return conditionSlug;
    }

    public void setConditionSlug(String conditionSlug) {
        this.conditionSlug = conditionSlug;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

}
