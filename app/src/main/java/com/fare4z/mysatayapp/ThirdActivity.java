package com.fare4z.mysatayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ThirdActivity extends AppCompatActivity {

    Button btnNext2;
    RadioGroup rgDining;
    RadioButton rbDining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btnNext2 = findViewById(R.id.btnNext2);
        rgDining = findViewById(R.id.rgDining);

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedid = rgDining.getCheckedRadioButtonId();

                rbDining = findViewById(selectedid);

                Bundle bundle = getIntent().getExtras();

                Intent i = new Intent(getApplicationContext(), FinalActivity.class);

                Bundle dataDining = new Bundle();

                dataDining.putString("rbDining",rbDining.getText().toString());

                i.putExtras(dataDining);
                i.putExtras(bundle);

                startActivity(i);

            }
        });



    }
}