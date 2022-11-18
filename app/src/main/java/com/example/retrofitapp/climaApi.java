package com.example.retrofitapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface climaApi {
    @GET("weather")
    Call<Main> getweather(@Query("city_name") String nomeCidade,
                          @Query("key") String apikey);
}
