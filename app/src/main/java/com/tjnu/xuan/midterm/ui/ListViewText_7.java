package com.tjnu.xuan.midterm.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.tjnu.xuan.midterm.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewText_7 extends AppCompatActivity {

    private int[] imageIds = new int[]{R.drawable.baiqian, R.drawable.yehua, R.drawable.zheyan, R.drawable.fengjiu, R.drawable.qingcang, R.drawable.donghua};
    private String[] names = new String[]{"白浅", "夜华", "折颜", "凤九", "擎苍", "东华"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_text_7);

        // 创建一个List集合，List集合的元素是Map
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", imageIds[i]);
            listItem.put("personName", names[i]);
            listItems.add(listItem);
        }


        ListView list = (ListView) findViewById(R.id.mylist);

        // 创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,
                listItems,
                R.layout.simple_item_7,
                new String[]{"header", "personName"},
                new int[]{R.id.header, R.id.names});

        // 为ListView设置Adapter
        list.setAdapter(simpleAdapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "你点击的是第"+(position+1)+"项",
                        Toast.LENGTH_SHORT).show();


            }
        });
    }
}
