package com.example.bt_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLogActivity(View view) {
        Intent tolog = new Intent(this, LogActivity.class);
        startActivity(tolog);
    }

    public void goToNormalActivity(View view) {
        Intent toNormal = new Intent(this, NormalActivity.class);
        startActivity(toNormal);
    }

    public void goToMechanismActivity(View view) {
        Intent toMechanism = new Intent(this, MechanismActivity.class);
        startActivity(toMechanism);
    }

    public void goToHandleActivity(View view) {
        Intent toHandle = new Intent(this, HandleActivity.class);
        startActivity(toHandle);
    }
    }

