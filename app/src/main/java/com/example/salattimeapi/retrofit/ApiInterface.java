package com.example.salattimeapi.retrofit;



import com.example.salattimeapi.example.Example;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    //Get Me
    @GET("v1/calendarByAddress?address=Dhaka&method=3&month=06&year=2021&fbclid=IwAR1VXOw6xkd1ZHfHoQKQoL_M8pF3cXWuMMeHW4l2qyLSaBz9wAElUpvWwP4")
    Call<Example> getAllInformation();




}
