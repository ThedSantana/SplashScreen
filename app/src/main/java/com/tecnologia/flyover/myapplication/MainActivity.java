package com.tecnologia.flyover.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {
    // Tempo da splash screen
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            /*
             * Exibindo splash com um tempo determinado.
             */
            @Override
            public void run() {
                // Esse método será executado sempre que o tempo acabar
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);

                // Fecha esta activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
