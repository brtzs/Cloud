package com.xhwj.cloud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LuncherActivity extends AppCompatActivity {
    Button login,register;  //定义登录、注册按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luncher);

        //寻找两个按钮的ID
        login = (Button)findViewById(R.id.login);
        register = (Button)findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginpage = new Intent(LuncherActivity.this, LoginActivity.class);
                startActivity(loginpage);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LuncherActivity.this,"注册新用户请联系管理员",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
