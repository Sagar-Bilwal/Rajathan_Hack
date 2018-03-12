package com.example.sagar.rajathan_hack;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SAGAR on 12-03-2018.
 */

public interface api
{


        String BASE_URL = "https://simplifiedcoding.net/demos/";
        @GET("marvel")
        Call<List<user>> getuser();



}
