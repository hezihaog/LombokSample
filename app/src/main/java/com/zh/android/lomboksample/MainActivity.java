package com.zh.android.lomboksample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.zh.android.lomboksample.entity.User;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn);
        Button button1 = findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                //实验set方法
                user.setUserName("admin");
                user.setPassword("admin");
                //实验get方法
                String userName = user.getUserName();
                String password = user.getPassword();
                Toast.makeText(getApplicationContext(),
                        "用户名：" + userName + " 密码：" + password,
                        Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User("root", "root");
                //试验toString方法
                String toString = user.toString();
                int hashCode = user.hashCode();
                Toast.makeText(getApplicationContext(),
                        "toString：" + toString + " hashCode：" + hashCode,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}