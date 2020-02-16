package com.example.buttonclickevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {

    TextView txtView;
    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast toast = Toast. makeText(getApplicationContext(),
                        "Welcome to Android",Toast.LENGTH_LONG);
                toast.setMargin(50,450);
                toast.show();
            }
        });
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.button1:
                txtView.setText("Welcome to Android!");
                break;
            case R.id.button2:
                txtView.setText("Mobile App Development!");
                break;
        }
    }
}
