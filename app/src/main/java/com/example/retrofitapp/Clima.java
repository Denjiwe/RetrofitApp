
package com.example.retrofitapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Clima {

    @SerializedName("by")
    @Expose
    private String by;
    @SerializedName("valid_key")
    @Expose
    private Boolean validKey;
    @SerializedName("results")
    @Expose
    private Results results;
    @SerializedName("execution_time")
    @Expose
    private Double executionTime;
    @SerializedName("from_cache")
    @Expose
    private Boolean fromCache;

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public Boolean getValidKey() {
        return validKey;
    }

    public void setValidKey(Boolean validKey) {
        this.validKey = validKey;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    public Double getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Double executionTime) {
        this.executionTime = executionTime;
    }

    public Boolean getFromCache() {
        return fromCache;
    }

    public void setFromCache(Boolean fromCache) {
        this.fromCache = fromCache;
    }

}
