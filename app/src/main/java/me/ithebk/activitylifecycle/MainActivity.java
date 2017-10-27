package me.ithebk.activitylifecycle;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printText("First Activity OnCreate");
        setContentView(R.layout.first_main);

       /* Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        },1000);*/

        startActivity(new Intent(MainActivity.this,SecondActivity.class));

    }
    @Override
    protected void onStart() {
        super.onStart();
        printText("First Activity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        printText("First Activity OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        printText("First Activity OnPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        printText("First Activity onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        printText("First Activity onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        printText("First Activity onDestroy");

    }

    private void printText(String text){
        System.out.println(text);
    }
}
