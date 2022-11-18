package com.example.retrofitapp;

import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("results")
    Results results;

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    @SerializedName("clima")
    Clima clima;

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }

    @SerializedName("forecast")
    Forecast forecast;

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }
}
