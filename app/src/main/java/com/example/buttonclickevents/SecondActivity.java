package com.example.buttonclickevents;

import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;

public class SecondActivity extends AppCompatActivity {

    TextView txtView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtView = findViewById(R.id.currentTime);
        intent = new Intent(this,MainActivity.class);
    }

    public void displayTime(View view) {
        SimpleDateFormat formatter =
                new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        txtView.setText(formatter.format(date));
    }

    public void gotoHome(View view) {
        startActivity(intent);
    }
}
