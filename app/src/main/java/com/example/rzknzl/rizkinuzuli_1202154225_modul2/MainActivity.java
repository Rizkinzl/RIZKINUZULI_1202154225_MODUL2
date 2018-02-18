package com.example.rzknzl.rizkinuzuli_1202154225_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.rzknzl.rizkinuzuli_1202154225_modul2.activities.MainMenu;

public class MainActivity extends AppCompatActivity {

    private static int splashInterval = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //
                Intent in = new Intent(MainActivity.this, MainMenu.class);
                startActivity(in); // menghubungkan activity splashscren ke main activity dengan intent

                Toast.makeText(MainActivity.this, "RIZKI NUZULI_1202154225", Toast.LENGTH_LONG).show();

                //jeda selesai Splashscreen
                this.finish();
            }

            private void finish() {

            }

        }, splashInterval);

    };
}