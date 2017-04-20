package com.tjnu.xuan.midterm.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tjnu.xuan.midterm.R;

public class TextViewChange_4 extends AppCompatActivity implements View.OnClickListener{

    private TextView colorText;
    private Button blue;
    private Button yellow;
    private Button red;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_change_4);

        initView();
    }

    private void initView() {
        colorText = (TextView) findViewById(R.id.colorText);
        blue = (Button) findViewById(R.id.blue);
        blue.setOnClickListener(this);
        yellow = (Button) findViewById(R.id.yellow);
        yellow.setOnClickListener(this);
        red = (Button) findViewById(R.id.red);
        red.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.blue:
                colorText.setTextColor(Color.BLUE);
                break;
            case R.id.yellow:
                colorText.setTextColor(Color.YELLOW);
                break;
            case R.id.red:
                colorText.setTextColor(Color.RED);
                break;
        }
    }
}
