package com.example.methodlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.methodlistview.Fruit;
import com.example.methodlistview.R;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId,
                        List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 获取当前项的Fruit实例
        Fruit fruit = getItem(position);

        // 从上下文中获取LayoutInflater实例，并将自定义的布局文件"resourceId"解析成View对象
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);

        // 查找布局文件中的ImageView控件，ID为fruit_image
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);

        // 查找布局文件中的TextView控件，ID为fruit_name
        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);

        // 设置ImageView控件的图片资源，使用Fruit实例中的图片ID
        fruitImage.setImageResource(fruit.getImageId());

        // 设置TextView控件的文本，使用Fruit实例中的名称
        fruitName.setText(fruit.getName());

        // 返回解析后的View对象
        return view;
    }


}
