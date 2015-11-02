package com.uspenskii.basebutton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;

public class modelActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model);
        getSupportActionBar().setTitle("Модель");
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onClickGolova(View view) {
        Intent intent = new Intent(modelActivity.this, c1a_golova.class);
        startActivity(intent);
    }

    public void onClickSheia(View view) {
        Intent intent = new Intent(modelActivity.this, c1b_sheia.class);
        startActivity(intent);
    }

    public void onClickPlecho(View view) {
        Intent intent = new Intent(modelActivity.this, c1c_plecho.class);
        startActivity(intent);
    }

    public void onClickGrud(View view) {
        Intent intent = new Intent(modelActivity.this, c1d_grud.class);
        startActivity(intent);
    }

    public void onClickPredplecho(View view) {
        Intent intent = new Intent(modelActivity.this, c1e_predplecho.class);
        startActivity(intent);
    }

    public void onClickJivot(View view) {
        Intent intent = new Intent(modelActivity.this, c1f_jivot.class);
        startActivity(intent);
    }

    public void onClickKist(View view) {
        Intent intent = new Intent(modelActivity.this, c1g_kist.class);
        startActivity(intent);
    }

    public void onClickBedro(View view) {
        Intent intent = new Intent(modelActivity.this, c1h_bedro.class);
        startActivity(intent);
    }

    public void onClickStopa(View view) {
        Intent intent = new Intent(modelActivity.this, c1i_stopa.class);
        startActivity(intent);
    }


}