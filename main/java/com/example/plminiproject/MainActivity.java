package com.example.plminiproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btmNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btmNav = findViewById(R.id.mf_bottom);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_content, new HomeFragment()).commit();

        btmNav.setSelectedItemId(R.id.nav_home);
        /*Bundle extras = getIntent().getExtras();
        String check = extras.getString("check");
        if(check == "home"){
            HomeFragment home = new HomeFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.main_content, home).commit();
        }
        else{
            CartFragment cart = new CartFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.main_content, cart).commit();
        }*/

        btmNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment frag = null;
                if (item.getItemId() == R.id.nav_home) {
                    frag = new HomeFragment();
                }
                else if(item.getItemId() == R.id.nav_cart){
                    frag = new CartFragment();
                }
                else{
                    frag = null;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.main_content, frag).commit();

                return true;
            }


        });
    }
}