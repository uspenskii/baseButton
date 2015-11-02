package com.uspenskii.basebutton;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;


public class helpActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        getSupportActionBar().setTitle("Помощь");

        ListView listView1 = (ListView) findViewById(R.id.elvMain);

        Product[] items = {
                new Product(1, "Внезапная смерть (нет сознания и пульса)"),
                new Product(2, "Состояние комы (нет сознания, есть пульс)"),
                new Product(3, "Общие правила транспортировки пострадавшего"),
                new Product(4, "Переломы"),
                new Product(5, "Ожоги"),
                new Product(6, "Кровотечения"),
                new Product(7, "Травмы"),
                new Product(8, "Раны"),
                new Product(9, "Обморожения"),
                new Product(10, "Электротравмы"),


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
                    Intent i = new Intent(helpActivity.this, a1_death.class);
                    startActivity(i);
                }

                else if (id == 1) {
                    Intent i = new Intent(helpActivity.this, a2_coma.class);
                    startActivity(i);
                }

                else if (id == 2) {
                    Intent i = new Intent(helpActivity.this, a3_transport.class);
                    startActivity(i);
                }

                else if (id == 3) {
                    Intent i = new Intent(helpActivity.this, a4_perelom.class);
                    startActivity(i);
                }

                else if (id == 4) {
                    Intent i = new Intent(helpActivity.this, a5_ojog.class);
                    startActivity(i);
                }

                else if (id == 5) {
                    Intent i = new Intent(helpActivity.this, a6_krovotech.class);
                    startActivity(i);
                }

                else if (id == 6) {
                    Intent i = new Intent(helpActivity.this, a7_travma.class);
                    startActivity(i);
                }

                else if (id == 7) {
                    Intent i = new Intent(helpActivity.this, a8_rana.class);
                    startActivity(i);
                }

                else if (id == 8) {
                    Intent i = new Intent(helpActivity.this, a9_obmorojenie.class);
                    startActivity(i);
                }

                else if (id == 9) {
                    Intent i = new Intent(helpActivity.this, a10_electro.class);
                    startActivity(i);
                }


            }
        });

    }
}