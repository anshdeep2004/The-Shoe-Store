package com.example.plminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MaleShop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_shop);

        Button male1 = findViewById(R.id.male1_cart);
        Button male2 = findViewById(R.id.male2_cart);
        Button male3 = findViewById(R.id.male3_cart);
        Button male4 = findViewById(R.id.male4_cart);
        Button male5 = findViewById(R.id.male5_cart);
        Button male6 = findViewById(R.id.male6_cart);

        male1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaleShop.this, PayingUserInfo.class);
                startActivity(intent);
            }
        });

        male2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaleShop.this, PayingUserInfo.class);
                startActivity(intent);
            }
        });

        male3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaleShop.this, PayingUserInfo.class);
                startActivity(intent);
            }
        });

        male4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaleShop.this, PayingUserInfo.class);
                startActivity(intent);
            }
        });

        male5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaleShop.this, PayingUserInfo.class);
                startActivity(intent);
            }
        });

        male6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaleShop.this, PayingUserInfo.class);
                startActivity(intent);
            }
        });
    }
}