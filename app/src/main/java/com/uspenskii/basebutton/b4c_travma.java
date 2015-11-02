package com.uspenskii.basebutton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class b4c_travma extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b4c_travma);
        getSupportActionBar().setTitle("Травма грудной клетки");
    }
    public void onClickGrud(View view) {
        Intent intent = new Intent(b4c_travma.this, b5a_rana.class);
        startActivity(intent);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1) {
            Intent intent = new Intent(b4c_travma.this, call.class);
            startActivity(intent);

        }
        else if (id == R.id.action_settings) {
            Intent i = new Intent(b4c_travma.this, profile.class);
            startActivity(i);

        }
        else if (id == R.id.item2) {
            Intent i = new Intent(b4c_travma.this, information.class);
            startActivity(i);

        }
        else if (id == R.id.information) {
            Intent i = new Intent(b4c_travma.this, two.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }
}