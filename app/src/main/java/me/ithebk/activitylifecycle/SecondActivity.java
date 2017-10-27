package me.ithebk.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        printText("Second Activity OnCreate");
        setContentView(R.layout.second_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        printText("Second Activity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        printText("Second Activity OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        printText("Second Activity OnPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        printText("Second Activity onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        printText("Second Activity onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        printText("Second Activity onDestroy");

    }

    private void printText(String text){
        System.out.println(text);
    }
}
