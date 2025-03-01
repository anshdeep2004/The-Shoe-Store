package com.example.plminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FemaleShop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_shop);

        Button female1 = findViewById(R.id.female1_cart);
        Button female2 = findViewById(R.id.female2_cart);
        Button female3 = findViewById(R.id.female3_cart);
        Button female4 = findViewById(R.id.female4_cart);
        Button female5 = findViewById(R.id.female5_cart);
        Button female6 = findViewById(R.id.female6_cart);

        female1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FemaleShop.this, PayingUserInfo.class);
                startActivity(intent);
            }
        });

        female2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FemaleShop.this, PayingUserInfo.class);
                startActivity(intent);
            }
        });

        female3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FemaleShop.this, PayingUserInfo.class);
                startActivity(intent);
            }
        });

        female4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FemaleShop.this, PayingUserInfo.class);
                startActivity(intent);
            }
        });

        female5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FemaleShop.this, PayingUserInfo.class);
                startActivity(intent);
            }
        });

        female6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FemaleShop.this, PayingUserInfo.class);
                startActivity(intent);
            }
        });
    }
}