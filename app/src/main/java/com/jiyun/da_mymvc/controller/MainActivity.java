package com.jiyun.da_mymvc.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jiyun.da_mymvc.R;
import com.jiyun.da_mymvc.modle.Bean;
import com.jiyun.da_mymvc.modle.CallBack;
import com.jiyun.da_mymvc.modle.OkHttpManager;

public class MainActivity extends AppCompatActivity {

    private OkHttpManager manager;
    String url="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = new OkHttpManager();
        manager.doget(url, new CallBack() {
            @Override
            public void success(Bean bean) {

            }

            @Override
            public void failed(String str) {

            }
        });
    }
}
