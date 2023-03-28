package com.jamillabltd.splashscreenfadeinout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    ImageView logo;
    TextView appName, thanks;
    Animation Splash_fade_in, Splash_fade_out;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        //for animation
        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.appName);
        thanks = findViewById(R.id.thankYouId);

        Splash_fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Splash_fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Splash_fade_out = AnimationUtils.loadAnimation(this, R.anim.fade_out);

        logo.setAnimation(Splash_fade_in);
        appName.setAnimation(Splash_fade_in);
        thanks.setAnimation(Splash_fade_out);

        //hold for 2 sec
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000); // 2 seconds

    }

}