package com.e.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MessageActivity extends AppCompatActivity {

    TextView tvcapital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        tvcapital = findViewById(R.id.tvcapital);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null)
        {
            tvcapital.setText(bundle.getString("capital"));
        }
        else
        {
            Toast.makeText(getApplicationContext(), "No capital", Toast.LENGTH_SHORT).show();
        }
    }
}
