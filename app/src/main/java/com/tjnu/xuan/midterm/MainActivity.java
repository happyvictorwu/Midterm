package com.tjnu.xuan.midterm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tjnu.xuan.midterm.ui.Cartoon_9;
import com.tjnu.xuan.midterm.ui.Hello_2;
import com.tjnu.xuan.midterm.ui.ListViewText_7;
import com.tjnu.xuan.midterm.ui.Login_5;
import com.tjnu.xuan.midterm.ui.Picture_8;
import com.tjnu.xuan.midterm.ui.RadioButton_3;
import com.tjnu.xuan.midterm.ui.Self_Button_6;
import com.tjnu.xuan.midterm.ui.SharedPreferences_10;
import com.tjnu.xuan.midterm.ui.TextViewChange_4;
import com.tjnu.xuan.midterm.ui.Time_1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bt_one;
    private Button bt_two;
    private Button bt_three;
    private Button bt_four;
    private Button bt_five;
    private Button bt_six;
    private Button bt_seven;
    private Button bt_eight;
    private Button bt_nine;
    private Button bt_ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        bt_one = (Button) findViewById(R.id.bt_one);
        bt_two = (Button) findViewById(R.id.bt_two);
        bt_three = (Button) findViewById(R.id.bt_three);
        bt_four = (Button) findViewById(R.id.bt_four);
        bt_five = (Button) findViewById(R.id.bt_five);
        bt_six = (Button) findViewById(R.id.bt_six);
        bt_seven = (Button) findViewById(R.id.bt_seven);
        bt_eight = (Button) findViewById(R.id.bt_eight);
        bt_nine = (Button) findViewById(R.id.bt_nine);
        bt_ten = (Button) findViewById(R.id.bt_ten);

        bt_one.setOnClickListener(this);
        bt_two.setOnClickListener(this);
        bt_three.setOnClickListener(this);
        bt_four.setOnClickListener(this);
        bt_five.setOnClickListener(this);
        bt_six.setOnClickListener(this);
        bt_seven.setOnClickListener(this);
        bt_eight.setOnClickListener(this);
        bt_nine.setOnClickListener(this);
        bt_ten.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_one:
                startActivity(new Intent(this, Time_1.class));
                break;
            case R.id.bt_two:
                startActivity(new Intent(this, Hello_2.class));
                break;
            case R.id.bt_three:
                startActivity(new Intent(this, RadioButton_3.class));
                break;
            case R.id.bt_four:
                startActivity(new Intent(this, TextViewChange_4.class));
                break;
            case R.id.bt_five:
                startActivity(new Intent(this, Login_5.class));
                break;
            case R.id.bt_six:
                startActivity(new Intent(this, Self_Button_6.class));
                break;
            case R.id.bt_seven:
                startActivity(new Intent(this, ListViewText_7.class));
                break;
            case R.id.bt_eight:
                startActivity(new Intent(this, Picture_8.class));
                break;
            case R.id.bt_nine:
                startActivity(new Intent(this, Cartoon_9.class));
                break;
            case R.id.bt_ten:
                startActivity(new Intent(this, SharedPreferences_10.class));
                break;
        }
    }
}
