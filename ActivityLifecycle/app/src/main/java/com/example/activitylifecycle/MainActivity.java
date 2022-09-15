package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt;
    String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        bt=findViewById(R.id.bt);


        Toast.makeText(getApplicationContext(),"create ", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"create ");


            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);



                }
            });

    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"start ", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"start");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"pause ", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"pause");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"restart ", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"restart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Destroy ", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"Destroy");
    }
}