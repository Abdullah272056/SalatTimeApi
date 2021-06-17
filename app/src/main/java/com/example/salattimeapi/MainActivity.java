package com.example.salattimeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.salattimeapi.example.Example;
import com.example.salattimeapi.retrofit.ApiInterface;
import com.example.salattimeapi.retrofit.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = RetrofitClient.getRetrofit("http://api.aladhan.com/").create(ApiInterface.class);
        getAllProductInfo();
    }

    // Get all select_customer info
    private void getAllProductInfo(){

        apiInterface.getAllInformation().enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
            if (response.code()==200){
                Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                Log.e("err","Success");
                Log.e("err",response.body().getData().get(0).getTimings().getFajr());
            }else {
                Toast.makeText(MainActivity.this, "un Success", Toast.LENGTH_SHORT).show();
                Log.e("err","un Success");

            }

            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.e("err","on failure");

            }
        });




    }
}