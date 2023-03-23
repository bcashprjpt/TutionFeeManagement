package com.bcash.tutionfeemanagement.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bcash.tutionfeemanagement.R;
import com.bcash.tutionfeemanagement.Util.CommonMethod;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.transition.Transition;

public class SplashScreen extends AppCompatActivity {

    TextView tv_powered_by;
    ImageView iv_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        init();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(SplashScreen.this,LoginActivity.class));
                finish();
            }
        },3000);


     }
     private void init()
     {
         getSupportActionBar().hide();
         tv_powered_by = findViewById(R.id.tv_powered_by);
         iv_logo = findViewById(R.id.iv_logo);

         CommonMethod cm = new CommonMethod(SplashScreen.this);
         cm.statusAndNavigationBarColor();
         Glide.with(this)
                 .load(R.mipmap.logo)
                 .transition(DrawableTransitionOptions.withCrossFade(2500))
                 .into(iv_logo);

         // load the animation
         Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left_to_right);
        // start the animation
        tv_powered_by.startAnimation(anim);

     }
}