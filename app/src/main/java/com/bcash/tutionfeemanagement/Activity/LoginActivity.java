package com.bcash.tutionfeemanagement.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bcash.tutionfeemanagement.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }
    private void init()
    {
        getSupportActionBar().hide();
    }
}