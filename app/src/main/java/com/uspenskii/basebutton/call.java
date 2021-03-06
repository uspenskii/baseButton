package com.uspenskii.basebutton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class call extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call);
        getSupportActionBar().setTitle("Вызов скорой помощи");
    }
    public void zvonok(View v) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        String phoneNumber = "103";
        callIntent.setData(Uri.parse("tel:" + phoneNumber));
        startActivity(callIntent);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1) {
            Intent intent = new Intent(call.this, call.class);
            startActivity(intent);

        }
        else if (id == R.id.action_settings) {
            Intent i = new Intent(call.this, profile.class);
            startActivity(i);

        }
        else if (id == R.id.item2) {
            Intent i = new Intent(call.this, information.class);
            startActivity(i);

        }
        else if (id == R.id.information) {
            Intent i = new Intent(call.this, two.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }
}
