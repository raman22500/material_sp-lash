package thirtyfour.com.splashlibrary;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Splash extends AppCompatActivity {


    private static int SPLASH_TIME_OUT = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        displaySplashScreen();
        Toast.makeText(this, "hiiiiiii", Toast.LENGTH_SHORT).show();

    }

        private void displaySplashScreen() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


            }
        }, SPLASH_TIME_OUT);

    }
    }

