package com.example.styles_batterycontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int lvl = 4;
    private static final int MAX_VAL = 8;
    private static final int MIN_VAL = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button increaseLevel = (Button) findViewById(R.id.increase);
        Button decreaseLevel = (Button) findViewById(R.id.decrease);
        ImageView batteryLvl = (ImageView) findViewById(R.id.batteryId);

        batteryLvl.setImageLevel(lvl);


        increaseLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lvl < MAX_VAL) {
                    lvl += 1;
                    batteryLvl.setImageLevel(lvl);

                }
            }
        });
        decreaseLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lvl > MIN_VAL) {
                    lvl -= 1;
                    batteryLvl.setImageLevel(lvl);
                }
            }
        });

    }
}