package com.tjnu.xuan.midterm.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tjnu.xuan.midterm.R;

public class Hello_2 extends AppCompatActivity implements View.OnClickListener{

    TextView tv_hello;
    Button bt_hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_2);
        initView();

    }

    private void initView() {
        tv_hello = (TextView) findViewById(R.id.tv_hello);
        bt_hello = (Button) findViewById(R.id.bt_hello);
        bt_hello.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_hello:
                tv_hello.setText("after clicked");
                break;
        }
    }
}
