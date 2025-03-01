package com.example.plminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class OrderSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_success);
        VideoView orderPlaced= findViewById(R.id.videoView);
        orderPlaced.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.success_video);
        orderPlaced.start();
        Button backToHome = findViewById(R.id.button3);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getSupportFragmentManager().beginTransaction().replace(R.id.orderSuccess, new HomeFragment()).commit();
                Intent intent = new Intent(OrderSuccess.this, MainActivity.class);
                //intent.putExtra("check", "home");
                startActivity(intent);
            }
        });


        orderPlaced.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                orderPlaced.start();
            }
        });



    }
}