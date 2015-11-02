package com.uspenskii.basebutton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class a9_obmorojenie extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a9_obmorojenie);
        getSupportActionBar().setTitle("Обморожения");

        ListView listView1 = (ListView) findViewById(R.id.list_obmorojenie);

        Product[] items = {
                new Product(1, "Общее переохлаждение организма"),
                new Product(2, "Обморожение (участков тела)"),


        };

        ArrayAdapter<Product> adapter = new ArrayAdapter<Product>(this,
                R.layout.my_list_item, items);

        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String item = ((TextView) view).getText().toString();

                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();
                if (id == 0) {
                    Intent i = new Intent(a9_obmorojenie.this, b6a_obmorojenie.class);
                    startActivity(i);
                } else if (id == 1) {
                    Intent i = new Intent(a9_obmorojenie.this, b6b_obmorojenie.class);
                    startActivity(i);
                }

            }
        });

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1) {
            Intent intent = new Intent(a9_obmorojenie.this, call.class);
            startActivity(intent);

        }
        else if (id == R.id.action_settings) {
            Intent i = new Intent(a9_obmorojenie.this, profile.class);
            startActivity(i);

        }
        else if (id == R.id.item2) {
            Intent i = new Intent(a9_obmorojenie.this, information.class);
            startActivity(i);

        }
        else if (id == R.id.information) {
            Intent i = new Intent(a9_obmorojenie.this, two.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }
}