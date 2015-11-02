package com.uspenskii.basebutton;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    EditText fi,blood,allergy,kontakti,dopolnitelno;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        getSupportActionBar().setTitle("Данные о пользователе");

                      /* 1объявление */      fi = (EditText)findViewById(R.id.editText);

                      /* 2объявление */      blood = (EditText)findViewById(R.id.editText2);

                      /* 3объявление */      allergy = (EditText)findViewById(R.id.editText3);

                      /* 4объявление */      kontakti = (EditText)findViewById(R.id.editText4);

                      /* 5объявление */      dopolnitelno = (EditText)findViewById(R.id.editText5);








    }

    public void save(View view) {
        SharedPreferences sp = getSharedPreferences("key", 0);
        SharedPreferences.Editor sedt = sp.edit();

       /*получаем и  записываем*/  sedt.putString("fi", fi.getText().toString());
       /*получаем и  записываем*/  sedt.putString("blood", blood.getText().toString());
       /*получаем и  записываем*/  sedt.putString("allergy", allergy.getText().toString());
       /*получаем и  записываем*/  sedt.putString("kontakti", kontakti.getText().toString());
       /*получаем и  записываем*/  sedt.putString("dopolnitelno", dopolnitelno.getText().toString());


        sedt.commit();
    }

    public void Perehod(View view) {

        Intent intent = new Intent(profile.this, ybasedan.class);
        startActivity(intent);


    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1) {
            Intent intent = new Intent(profile.this, call.class);
            startActivity(intent);

        }
        else if (id == R.id.action_settings) {
            Intent i = new Intent(profile.this, profile.class);
            startActivity(i);

        }
        else if (id == R.id.item2) {
            Intent i = new Intent(profile.this, information.class);
            startActivity(i);

        }
        else if (id == R.id.information) {
            Intent i = new Intent(profile.this, two.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }




}