package com.example.lee.cartolafc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View view) {
        Intent i = new Intent(MainActivity.this, Cadastro.class);
        startActivity(i);
    }

    public void onBolaCheiaMurcha(View view){
        Intent e = new Intent(MainActivity.this, BolaCheiaMurchaActivity.class);
        startActivity(e);
    }
}
