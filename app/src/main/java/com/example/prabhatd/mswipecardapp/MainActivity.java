package com.example.prabhatd.mswipecardapp;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    public static final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View v){
        startService(new Intent(getBaseContext(),MyService.class));
        Log.e(TAG,"Service Started");
    }

    public void stopService(View v){
        stopService(new Intent(getBaseContext(),MyService.class));
        Log.e(TAG,"Service Stoped");
    }

    public void broadcast(View v){
        Intent intent = new Intent();
        intent.setAction("com.Prabhat.CUSTOM_INTENT");
        sendBroadcast(intent);
    }


}
