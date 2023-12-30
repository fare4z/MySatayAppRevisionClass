package com.fare4z.mysatayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText etAyam, etKambing, etDaging, etName, etPhone;
    CheckBox cbAyam, cbKambing, cbDaging;

    Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etAyam = findViewById(R.id.etAyam);
        etDaging = findViewById(R.id.etDaging);
        etKambing = findViewById(R.id.etKambing);
        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);

        cbAyam = findViewById(R.id.cbAyam);
        cbKambing = findViewById(R.id.cbKambing);
        cbDaging = findViewById(R.id.cbDaging);

        btnNext = findViewById(R.id.btnNext2);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                if (cbAyam.isActivated()) {
                    Double AyamPrice = 0.80;
                    Double totalAyam = AyamPrice * Double.valueOf(etAyam.getText().toString());

                    bundle.putString("pieceAyam", etAyam.getText().toString());
                    bundle.putString("totalAyam",totalAyam.toString());
                }

                if (cbKambing.isActivated()) {
                    Double KambingPrice = 0.90;
                    Double totalKambing = KambingPrice * Double.valueOf(etKambing.getText().toString());

                    bundle.putString("pieceKambing",etKambing.getText().toString());
                    bundle.putString("totalKambing", totalKambing.toString());
                }

                if (cbDaging.isActivated()) {
                    Double DagingPrice = 0.70;
                    Double totalDaging = DagingPrice * Double.valueOf(etDaging.getText().toString());

                    bundle.putString("pieceDaging", etDaging.getText().toString());
                    bundle.putString("totalDaging",totalDaging.toString());
                }

                bundle.putString("name",etName.getText().toString());
                bundle.putString("phone",etPhone.getText().toString());


                Intent i = new Intent(getApplicationContext(),ThirdActivity.class);
                i.putExtras(bundle);

                Toast.makeText(getApplicationContext(),"Second Activity Submited",Toast.LENGTH_LONG);

                startActivity(i);



            }
        });


    }
}