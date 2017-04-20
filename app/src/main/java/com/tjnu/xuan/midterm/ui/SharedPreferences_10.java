package com.tjnu.xuan.midterm.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tjnu.xuan.midterm.R;

public class SharedPreferences_10 extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences_10);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_write:
                break;
            case R.id.bt_read:
                break;
        }
    }
}
