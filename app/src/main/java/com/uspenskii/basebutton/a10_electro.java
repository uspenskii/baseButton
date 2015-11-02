package com.uspenskii.basebutton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class a10_electro extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a10_electro);
        getSupportActionBar().setTitle("Электротравма/удар молнией");
    }
    public void onClickReanimation(View view) {
        Intent intent = new Intent(a10_electro.this, a1_death.class);
        startActivity(intent);
    }
    public void onClickComa(View view) {
        Intent intent = new Intent(a10_electro.this, a2_coma.class);
        startActivity(intent);
    }
    public void onClickOjog(View view) {
        Intent intent = new Intent(a10_electro.this, b2b_ojog.class);
        startActivity(intent);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1) {
            Intent intent = new Intent(a10_electro.this, call.class);
            startActivity(intent);

        }
        else if (id == R.id.action_settings) {
            Intent i = new Intent(a10_electro.this, profile.class);
            startActivity(i);

        }
        else if (id == R.id.item2) {
            Intent i = new Intent(a10_electro.this, information.class);
            startActivity(i);

        }
        else if (id == R.id.information) {
            Intent i = new Intent(a10_electro.this, two.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }
}