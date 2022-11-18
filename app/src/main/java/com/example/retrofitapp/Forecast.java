
package com.example.retrofitapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("weekday")
    @Expose
    private String weekday;
    @SerializedName("max")
    @Expose
    private Integer max;
    @SerializedName("min")
    @Expose
    private Integer min;
    @SerializedName("cloudiness")
    @Expose
    private Double cloudiness;
    @SerializedName("rain")
    @Expose
    private Double rain;
    @SerializedName("rain_probability")
    @Expose
    private Integer rainProbability;
    @SerializedName("wind_speedy")
    @Expose
    private String windSpeedy;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("condition")
    @Expose
    private String condition;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
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

    public Integer getRainProbability() {
        return rainProbability;
    }

    public void setRainProbability(Integer rainProbability) {
        this.rainProbability = rainProbability;
    }

    public String getWindSpeedy() {
        return windSpeedy;
    }

    public void setWindSpeedy(String windSpeedy) {
        this.windSpeedy = windSpeedy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

}
