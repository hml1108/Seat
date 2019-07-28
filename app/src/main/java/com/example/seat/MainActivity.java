package com.example.seat;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1 = findViewById(R.id.Seat1);
        iv2 = findViewById(R.id.Seat4);
        iv3 = findViewById(R.id.Seat5);
        iv4 = findViewById(R.id.Seat7);
        iv5 = findViewById(R.id.Car1);
        iv6 = findViewById(R.id.Car4);
        iv7 = findViewById(R.id.Car5);
        iv8 = findViewById(R.id.Car7);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageResource(R.drawable.seat2);
                iv5.setImageResource(R.drawable.car2);
                iv2.setImageResource(R.drawable.seat3);
                iv3.setImageResource(R.drawable.seat5);
                iv4.setImageResource(R.drawable.seat7);
                iv6.setImageResource(R.drawable.car3);
                iv7.setImageResource(R.drawable.car5);
                iv8.setImageResource(R.drawable.car7);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv2.setImageResource(R.drawable.seat4);
                iv6.setImageResource(R.drawable.car4);
                iv1.setImageResource(R.drawable.seat1);
                iv3.setImageResource(R.drawable.seat5);
                iv4.setImageResource(R.drawable.seat7);
                iv5.setImageResource(R.drawable.car1);
                iv7.setImageResource(R.drawable.car5);
                iv8.setImageResource(R.drawable.car7);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv3.setImageResource(R.drawable.seat6);
                iv7.setImageResource(R.drawable.car6);
                iv1.setImageResource(R.drawable.seat1);
                iv2.setImageResource(R.drawable.seat3);
                iv4.setImageResource(R.drawable.seat7);
                iv5.setImageResource(R.drawable.car1);
                iv6.setImageResource(R.drawable.car3);
                iv8.setImageResource(R.drawable.car7);
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv4.setImageResource(R.drawable.seat8);
                iv8.setImageResource(R.drawable.car8);
                iv1.setImageResource(R.drawable.seat1);
                iv2.setImageResource(R.drawable.seat3);
                iv3.setImageResource(R.drawable.seat5);
                iv5.setImageResource(R.drawable.car1);
                iv6.setImageResource(R.drawable.car3);
                iv7.setImageResource(R.drawable.car5);
            }
        });
    }

}






