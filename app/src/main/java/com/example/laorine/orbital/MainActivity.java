package com.example.laorine.orbital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final double RADIUS = 6_378.14;
    private static final double GRAVITY = 6.67 * Math.pow(10, -11);
    private static final double EARTH_MASS = 5.9736 * Math.pow(10, 24);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate (View view) {
        EditText editView = (EditText) findViewById(R.id.editText);
        Integer distance = Integer.valueOf(editView.getText().toString());

        double period = Math.sqrt(4 * Math.pow(Math.PI, 2) * Math.pow((distance + RADIUS) * 1000, 3) / (GRAVITY * EARTH_MASS));

        TextView resultView = (TextView) findViewById(R.id.textView);
        resultView.setText(period/(60*60) + "h");
    }
}
