package com.saidur.deeplink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        /*Intent intent=getIntent();
        Uri data = intent.getData();
        data.getQueryParameter("key");*/


        Toast.makeText(this, "On creae Id : ", Toast.LENGTH_LONG).show();
  /*      if (getIntent() !=null) {
            Intent intent = getIntent();
            Uri data = intent.getData();
            String data1= data.getQueryParameter("key1"); // you will get the value "value1" from application 1
            String data2= data.getQueryParameter("key2");

        *//*    long detailId = getIntent().getLongExtra("id",-1);
            Toast.makeText(this, "user Id : "+detailId, Toast.LENGTH_LONG).show();
            if (detailId != -1){
                // do your stuff and displayed page by id
                Toast.makeText(this, "dont know ", Toast.LENGTH_LONG).show();
            }*//*
        }*/
        /*Intent intent = getIntent();
        Uri data = intent.getData();
        String userid = data.getQueryParameter("id");*/

    }

    @Override
    protected void onStart() {
        Toast.makeText(this, "don start", Toast.LENGTH_LONG).show();
        super.onStart();
    }
}