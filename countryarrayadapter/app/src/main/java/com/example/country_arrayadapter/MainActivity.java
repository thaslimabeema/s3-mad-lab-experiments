package com.example.country_arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    //initialize view's
    ListView listView;
    String[] country = {"India","Brazil","Canada","France","Russia","Zambia"};
    int[] code = {91,55,1,33,7,260};//fruits images
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);

        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
        for (int i=0;i<country.length;i++)
        {
            HashMap<String,String> hashMap=new HashMap<>();//create a hashmap to store the data in key value pair
            hashMap.put("name",country[i]);
            hashMap.put("code",code[i]+"");
            arrayList.add(hashMap);//add the hashmap into arrayList
        }
        String[] from={"code","name"};//string array
        int[] to={R.id.textView1,R.id.textView2};//int array of views id's
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,R.layout.list_view_items,from,to);//Create object and set the parameters for simpleAdapter
        listView.setAdapter(simpleAdapter);//sets the adapter for listView

        //perform listView item click event
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),country[i],Toast.LENGTH_LONG).show();//show the selected image in toast according to position
            }
        });
    }


}