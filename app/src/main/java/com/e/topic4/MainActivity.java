package com.e.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static String countries[] ={
            "Nepal",
            "China",
            "India",
            "Canada",
            "US"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstCountries = findViewById(R.id.lstcountries);

        ArrayAdapter countryadapater = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);

        lstCountries.setAdapter(countryadapater);

    }
}
