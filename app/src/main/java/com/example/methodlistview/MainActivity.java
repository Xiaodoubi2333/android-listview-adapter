package com.example.methodlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    //*阶段二：listView：(  虚拟list)， List<Fruit>
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 设置当前 Activity 的布局文件为 activity_main.xml       //* 首先初始化 listView.xml 这个大的控件

        //*阶段二：listView：(  虚拟list)， List<Fruit>
        initFruits();   //* 初始化水果数据

        //** （   部件1）：虚拟链接1---->适配器
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);           //* 然后单独初始化 "  listView.xml，的项"：适配器，初始化fruit_item，被放在fruitList.
        //*阶段二：listView：(  虚拟list)， List<Fruit>


// 创建一个 ArrayAdapter，并将 data 列表中的数据绑定到 android.R.layout.simple_list_item_1 这个内置的列表项布局上
// 该 ArrayAdapter 会将每一个数据项显示为一个简单的列表项

        //* 功能1：画出画面：  适配器，被画出来.
        ListView listView = (ListView) findViewById(R.id.list_view);    // 查找布局文件中的 ListView 控件，ID 为 list_view      //** （  部件2）：虚拟链接2 ----》真实图：listView=findId< R.id.list_view>
        listView.setAdapter(adapter);   // 将创建好的 ArrayAdapter 设置为 ListView 的适配器，这样 ListView 就会显示 data 列表中的数据        //**        （   部件3:）：适配器链接---->虚拟链接2
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange", R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon", R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear", R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape", R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple", R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry", R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango", R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }





}
