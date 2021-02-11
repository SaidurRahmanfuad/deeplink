package com.saidur.deeplink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
public static String TAG="Activity3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toast.makeText(this, "On creae Id : ", Toast.LENGTH_LONG).show();
        if (getIntent() !=null) {
            Intent intent = getIntent();
            Uri data = intent.getData();
            String data1= data.getQueryParameter("key1"); // you will get the value "value1" from application 1
            String data2= data.getQueryParameter("key2");
            Log.d(TAG, "user id: "+data1);
            Log.e(TAG, "user id: "+data1);
            Toast.makeText(this, "data : "+data1, Toast.LENGTH_LONG).show();
        }
    }
}