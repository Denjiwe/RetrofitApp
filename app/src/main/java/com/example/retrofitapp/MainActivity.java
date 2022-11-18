package com.example.retrofitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
EditText etCidade;
TextView tv;
String url="https://api.hgbrasil.com/weather?key=(chave da api)&city_name=(nome da cidade)";
String apikey="ed464981";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCidade=findViewById(R.id.etCidade);
        tv=findViewById(R.id.tv);
    }
    public void getweather(View v){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.hgbrasil.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        climaApi myapi=retrofit.create(climaApi.class);
        Call<Main> maincall=myapi.getweather(etCidade.getText().toString().trim(),apikey);
        maincall.enqueue(new Callback<Main>() {
            @Override
            public void onResponse(Call<Main> call, Response<Main> response) {
                if(response.code()==404) {
                    Toast.makeText(MainActivity.this, "Por favor informe uma cidade válida", Toast.LENGTH_LONG).show();
                } else if (!(response.isSuccessful())){
                    Toast.makeText(MainActivity.this, response.code(), Toast.LENGTH_LONG).show();
                }
                Main mydata=response.body();
                Results results = mydata.getResults();
                Integer temp=results.getTemp();
                tv.setText(String.valueOf(temp)+"Cº");
            }

            @Override
            public void onFailure(Call<Main> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}