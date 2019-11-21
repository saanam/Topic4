package com.e.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static String countries[] ={
            "Nepal", "Kathmandu",
            "China", "Beijing",
            "India", "Delhi",
            "Canada", "Ottawa",
            "US", "Washing, D.C"
    };

    private Map<String,String> dictonary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstCountries = findViewById(R.id.lstcountries);

        dictonary = new HashMap<>();
        for(int i=0; i<countries.length; i+=2)
        {
            dictonary.put(countries[i],countries[i+1]);
        }

        ArrayAdapter countryadapater = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new ArrayList<String>(dictonary.keySet()));

        lstCountries.setAdapter(countryadapater);

        lstCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String country = parent.getItemAtPosition(position).toString();
                String capital = dictonary.get(country);

                Intent intent = new Intent(MainActivity.this, MessageActivity.class);
                intent.putExtra("capital", capital);
                startActivity(intent);

            }
        });

    }
}
