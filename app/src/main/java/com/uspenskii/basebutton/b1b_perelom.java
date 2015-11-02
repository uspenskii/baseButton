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


public class b1b_perelom extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b1b_perelom);
        getSupportActionBar().setTitle("Закрытые переломы");

        ListView listView1 = (ListView) findViewById(R.id.b1b_perelom);

        Product[] items = {
                new Product(1, "Перелом плечевой кости"),
                new Product(2, "Перелом костей предплечья"),
                new Product(3, "Повреждения голеностопного сустава"),
                new Product(4, "Перелом бедренной кости, коленного сустава и костей голени"),


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
                    Intent i = new Intent(b1b_perelom.this, b1c_perelom.class);
                    startActivity(i);
                } else if (id == 1) {
                    Intent i = new Intent(b1b_perelom.this, b1d_perelom.class);
                    startActivity(i);
                } else if (id == 2) {
                    Intent i = new Intent(b1b_perelom.this, b1e_perelom.class);
                    startActivity(i);
                } else if (id == 3) {
                    Intent i = new Intent(b1b_perelom.this, b1f_perelom.class);
                    startActivity(i);
                }

            }
        });

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1) {
            Intent intent = new Intent(b1b_perelom.this, call.class);
            startActivity(intent);

        }
        else if (id == R.id.action_settings) {
            Intent i = new Intent(b1b_perelom.this, profile.class);
            startActivity(i);

        }
        else if (id == R.id.item2) {
            Intent i = new Intent(b1b_perelom.this, information.class);
            startActivity(i);

        }
        else if (id == R.id.information) {
            Intent i = new Intent(b1b_perelom.this, two.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }
}