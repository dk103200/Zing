package com.zingmp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    private  static int SPLASH_SCREEN = 5000;

    Animation loadAnim;
    ImageView load;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        loadAnim = AnimationUtils.loadAnimation(this, R.anim.ani_rotate);
        load = findViewById(R.id.img_load);
        load.setAnimation(loadAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, PersonalActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}