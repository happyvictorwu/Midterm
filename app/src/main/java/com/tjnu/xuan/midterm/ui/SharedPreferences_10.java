package com.tjnu.xuan.midterm.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tjnu.xuan.midterm.R;
import com.tjnu.xuan.midterm.ShareUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SharedPreferences_10 extends AppCompatActivity implements View.OnClickListener{
    private Button bt_read;
    private Button bt_write;
    private Button bt_clean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_10);
        initView();
    }

    private void initView() {
        bt_read = (Button) findViewById(R.id.bt_read);
        bt_read.setOnClickListener(this);
        bt_write = (Button) findViewById(R.id.bt_write);
        bt_write.setOnClickListener(this);
        bt_clean = (Button) findViewById(R.id.bt_clean);
        bt_clean.setOnClickListener(this);
    }

    private String getNowTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss");
        Date curDate = new Date(System.currentTimeMillis());
        String str = simpleDateFormat.format(curDate);
        return str;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_write:
                ShareUtils.putString(this,"nowTime",getNowTime());
                ShareUtils.putInt(this,"random",(int)(Math.random()*100) );
                break;
            case R.id.bt_read:
                if (ShareUtils.getString(this,"nowTime"," ").equals(" ") &&
                        ShareUtils.getInt(this,"random",-1) == -1 )
                {
                    Toast.makeText(getApplicationContext(), "您暂时还未写入数据", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext()
                            , "系统时间为"+ ShareUtils.getString(this,"nowTime"," ") +" 随机数是:" +
                                    ShareUtils.getInt(this,"random",-1)
                            , Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.bt_clean:
                ShareUtils.deleAll(this);
                break;
        }
    }
}
