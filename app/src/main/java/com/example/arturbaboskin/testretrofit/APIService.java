package com.example.arturbaboskin.testretrofit;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("inf/meteo.php")
    Call<List<Weather>> getWeatherList(@Query("tid") int tid);

}
