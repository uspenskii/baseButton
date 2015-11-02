package com.uspenskii.basebutton;

        import android.app.TabActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.TabHost;

public class MainActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // получаем TabHost
        TabHost tabHost = getTabHost();

        // инициализация была выполнена в getTabHost
        // метод setup вызывать не нужно

        TabHost.TabSpec tabSpec;

        tabSpec = tabHost.newTabSpec("tag1");
        tabSpec.setIndicator("Помощь");
        tabSpec.setContent(new Intent(this, helpActivity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator("Модель");
        tabSpec.setContent(new Intent(this, modelActivity.class));
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag3");
        tabSpec.setIndicator("Карта");
        tabSpec.setContent(new Intent(this, MapsActivity.class));
        tabHost.addTab(tabSpec);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item1) {
            Intent intent = new Intent(MainActivity.this, call.class);
            startActivity(intent);

        }
        else if (id == R.id.action_settings) {
                Intent i = new Intent(MainActivity.this, profile.class);
                startActivity(i);

        }
        else if (id == R.id.item2) {
            Intent i = new Intent(MainActivity.this, information.class);
            startActivity(i);

        }
        else if (id == R.id.information) {
            Intent i = new Intent(MainActivity.this, two.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }

}