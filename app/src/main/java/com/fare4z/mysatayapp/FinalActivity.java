package com.fare4z.mysatayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class FinalActivity extends AppCompatActivity {

    TextView tvNama, tvDining;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        tvNama = findViewById(R.id.tvNama);
        tvDining = findViewById(R.id.tvDining);

        Bundle bundle = getIntent().getExtras();


        tvDining.setText(bundle.getString("rbDining","-"));
        tvNama.setText(bundle.getString("name","-"));

        Toast.makeText(this, "Order Submitted", Toast.LENGTH_SHORT).show();
    }
}