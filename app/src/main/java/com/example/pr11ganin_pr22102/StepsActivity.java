package com.example.pr11ganin_pr22102;

import android.annotation.SuppressLint;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


    public class StepsActivity  extends AppCompatActivity implements View.OnClickListener{
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, site.class));
    }
}
