package com.tjnu.xuan.midterm.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.tjnu.xuan.midterm.R;

public class RadioButton_3 extends AppCompatActivity implements View.OnClickListener{

    RadioGroup rg;
    RadioButton rd_1;
    RadioButton rd_2;
    RadioButton rd_3;
    TextView tv_rd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_3);

        initView();
    }

    private void initView() {
        rg = (RadioGroup) findViewById(R.id.rg);
        rd_1 = (RadioButton) findViewById(R.id.rd_1);
        rd_1.setOnClickListener(this);
        rd_2 = (RadioButton) findViewById(R.id.rd_2);
        rd_2.setOnClickListener(this);
        rd_3 = (RadioButton) findViewById(R.id.rd_3);
        rd_3.setOnClickListener(this);
        tv_rd = (TextView) findViewById(R.id.tv_rd);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rd_1:
                tv_rd.setText(rd_1.getText());
                break;
            case R.id.rd_2:
                tv_rd.setText(rd_2.getText());
                break;
            case R.id.rd_3:
                tv_rd.setText(rd_3.getText());
                break;
        }
    }
}
