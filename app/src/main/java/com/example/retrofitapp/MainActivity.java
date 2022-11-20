package com.example.retrofitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private Spinner spCidade1;
    private Spinner spCidade2;
    private Spinner spCidade3;

    private TextView tvTemperatura1;
    private TextView tvTemperatura2;
    private TextView tvTemperatura3;

    private TextView tvDescricao1;
    private TextView tvDescricao2;
    private TextView tvDescricao3;

    private TextView tvChuva1;
    private TextView tvChuva2;
    private TextView tvChuva3;

private String url="https://api.hgbrasil.com/weather?key=(chave da api)&city_name=(nome da cidade)";
private String apikey="a60113ec";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spCidade1= (Spinner) findViewById(R.id.spCidade1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.lista_cidade, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCidade1.setAdapter(adapter1);

        spCidade2= (Spinner) findViewById(R.id.spCidade2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.lista_cidade, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCidade2.setAdapter(adapter2);

        spCidade3= (Spinner) findViewById(R.id.spCidade3);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.lista_cidade, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCidade3.setAdapter(adapter3);

        tvTemperatura1=findViewById(R.id.tvTemperatura1);
        tvTemperatura2=findViewById(R.id.tvTemperatura2);
        tvTemperatura3=findViewById(R.id.tvTemperatura3);

        tvDescricao1=findViewById(R.id.tvDescricao1);
        tvDescricao2=findViewById(R.id.tvDescricao2);
        tvDescricao3=findViewById(R.id.tvDescricao3);

        tvChuva1=findViewById(R.id.tvChuva1);
        tvChuva2=findViewById(R.id.tvChuva2);
        tvChuva3=findViewById(R.id.tvChuva3);
    }
    public void getweather1(View v){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.hgbrasil.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        climaApi myapi=retrofit.create(climaApi.class);
        Call<Main> maincall=myapi.getweather(spCidade1.getSelectedItem().toString().trim(),apikey);
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
                String description = results.getDescription();
                Double chuva = results.getRain();

                tvTemperatura1.setText(String.valueOf(temp)+"Cº");
                tvDescricao1.setText(String.valueOf(description));
                tvChuva1.setText(String.valueOf(chuva)+" ML");

            }

            @Override
            public void onFailure(Call<Main> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void getweather2(View v){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.hgbrasil.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        climaApi myapi=retrofit.create(climaApi.class);
        Call<Main> maincall=myapi.getweather(spCidade2.getSelectedItem().toString().trim(),apikey);
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
                String description = results.getDescription();
                Double chuva = results.getRain();

                tvTemperatura2.setText(String.valueOf(temp)+"Cº");
                tvDescricao2.setText(String.valueOf(description));
                tvChuva2.setText(String.valueOf(chuva)+" ML");

            }

            @Override
            public void onFailure(Call<Main> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void getweather3(View v){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.hgbrasil.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        climaApi myapi=retrofit.create(climaApi.class);
        Call<Main> maincall=myapi.getweather(spCidade3.getSelectedItem().toString().trim(),apikey);
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
                String description = results.getDescription();
                Double chuva = results.getRain();

                tvTemperatura3.setText(String.valueOf(temp)+"Cº");
                tvDescricao3.setText(String.valueOf(description));
                tvChuva3.setText(String.valueOf(chuva)+" ML");

            }

            @Override
            public void onFailure(Call<Main> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}