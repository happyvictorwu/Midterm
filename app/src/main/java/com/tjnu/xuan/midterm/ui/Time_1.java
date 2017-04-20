package com.tjnu.xuan.midterm.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tjnu.xuan.midterm.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time_1 extends AppCompatActivity {

    private TextView tv_time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_1);

        tv_time = (TextView) findViewById(R.id.tv_time);
        setNowTime();

    }

    private void setNowTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss");
        Date curDate = new Date(System.currentTimeMillis());
        String str = simpleDateFormat.format(curDate);
        tv_time.setText("现在的系统时间是:" + str);
    }
}
