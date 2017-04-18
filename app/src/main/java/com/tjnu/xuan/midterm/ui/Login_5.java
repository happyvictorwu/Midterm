package com.tjnu.xuan.midterm.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tjnu.xuan.midterm.R;

public class Login_5 extends AppCompatActivity implements View.OnClickListener {

    TextView checkLogin;
    EditText account;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_5);
        initView();
    }

    private void initView() {
        checkLogin = (TextView) findViewById(R.id.checkLogin);
        account = (EditText) findViewById(R.id.account);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                if (account.getText().toString().equals("CSG") && password.getText().toString().equals("CSG")) {
                    checkLogin.setText("登录成功");
                } else {
                    checkLogin.setText("登录失败");
                }
                break;
        }
    }
}
