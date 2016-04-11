package com.example.scorpio.arrayadapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ListView mListView= (ListView) findViewById(R.id.listview);
        String[] textArray={"功能1","功能2","功能3","功能4","功能5","功能6","功能7","功能8"};
        /*定义数据适配器
        * android.R.layout.simple_list_item_1 Listview的子条目现实的布局的id
        * textArray 显示在ListView列表中的数据*/
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                textArray);
        
        mListView.setAdapter(adapter);
        
    }
}
