package com.example.methodlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    private String[] data ={"Apple","Banana"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 设置当前 Activity 的布局文件为 activity_main.xml

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data);
// 创建一个 ArrayAdapter，并将 data 列表中的数据绑定到 android.R.layout.simple_list_item_1 这个内置的列表项布局上
// 该 ArrayAdapter 会将每一个数据项显示为一个简单的列表项

        //* 功能1：画出画面：  适配器，被画出来.
        ListView listView = (ListView) findViewById(R.id.list_view);    // 查找布局文件中的 ListView 控件，ID 为 list_view
        listView.setAdapter(adapter);   // 将创建好的 ArrayAdapter 设置为 ListView 的适配器，这样 ListView 就会显示 data 列表中的数据


    }
}
