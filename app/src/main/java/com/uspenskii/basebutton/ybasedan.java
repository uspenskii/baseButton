package com.uspenskii.basebutton;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class ybasedan extends ActionBarActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        getSupportActionBar().setTitle("Данные о пользователе");

        textView = (TextView)findViewById(R.id.textView);

        SharedPreferences sp = getSharedPreferences("key", 0);
        String fi = sp.getString("fi","");
        String blood = sp.getString("blood", "");
        String allergy = sp.getString("allergy","");
        String kontakti = sp.getString("kontakti","");
        String dopolnitelno = sp.getString("dopolnitelno","");

        textView.setText("ФАМИЛИЯ И ИМЯ:\n" + fi + "\n\nГРУППА КРОВИ:\n" + blood + "\n\nАЛЛЕРГИЯ НА:\n" + allergy + "\n\nКОНТАКТНЫЕ ДАННЫЕ:\n" + kontakti + "\n\nДОПОЛНИТЕЛЬНЫЕ ДАННЫЕ:\n" + dopolnitelno);





    }


}
