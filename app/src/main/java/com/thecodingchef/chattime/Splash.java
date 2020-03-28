package com.thecodingchef.chattime;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_splash);

        Thread td = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(Exception e){
                    e.printStackTrace();
                }finally {
                    Intent it = new Intent(Splash.this, MainActivity.class);
                    startActivity(it);
                }
            }
        };
        td.start();

    }
}