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


public class c1i_stopa extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c1i_stopa);
        getSupportActionBar().setTitle("Повреждения голеностопного сустава");

        ListView listView1 = (ListView) findViewById(R.id.list_stopa);

        Product[] items = {
                new Product(1, "При повреждении голеностопного сустава"),
                new Product(2, "При открытом переломе"),
                new Product(3, "При кровотечении"),
                new Product(4, "При внутреннем кровотечении"),
                new Product(5, "При ожогах"),
                new Product(6, "При обморожениях"),

        };

        ArrayAdapter<Product> adapter = new ArrayAdapter<Product>(this,
                R.layout.my_list_item2, items);

        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String item = ((TextView) view).getText().toString();

                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();
                if (id == 0) {
                    Intent i = new Intent(c1i_stopa.this, b1e_perelom.class);
                    startActivity(i);
                } else if (id == 1) {
                    Intent i = new Intent(c1i_stopa.this, b1a_perelom.class);
                    startActivity(i);
                } else if (id == 2) {
                    Intent i = new Intent(c1i_stopa.this, b3c_krovotech.class);
                    startActivity(i);
                } else if (id == 3) {
                    Intent i = new Intent(c1i_stopa.this, b3b_krovotech.class);
                    startActivity(i);
                } else if (id == 4) {
                    Intent i = new Intent(c1i_stopa.this, a5_ojog.class);
                    startActivity(i);
                } else if (id == 5) {
                    Intent i = new Intent(c1i_stopa.this, a9_obmorojenie.class);
                    startActivity(i);
                }


            }
        });

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1) {
            Intent intent = new Intent(c1i_stopa.this, call.class);
            startActivity(intent);

        }
        else if (id == R.id.action_settings) {
            Intent i = new Intent(c1i_stopa.this, profile.class);
            startActivity(i);

        }
        else if (id == R.id.item2) {
            Intent i = new Intent(c1i_stopa.this, information.class);
            startActivity(i);

        }
        else if (id == R.id.information) {
            Intent i = new Intent(c1i_stopa.this, two.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }
}