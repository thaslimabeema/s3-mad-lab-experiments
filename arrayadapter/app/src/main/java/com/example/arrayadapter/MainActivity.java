package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    // Array of strings
    ListView listView;
    String list[] = {"India-91","Brazil-55","Canada-1","france-33","Italy-39","Japan-81","Maldives-960","Norway-47"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textview, list);
        listView.setAdapter(arrayAdapter);
    }

}
