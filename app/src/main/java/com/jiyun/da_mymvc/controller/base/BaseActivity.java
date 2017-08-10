package com.jiyun.da_mymvc.controller.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jiyun.da_mymvc.App;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        App.baseActivity = this;
        initView();
        initData();
        initListener();
        loadData();

    }

    /**
     * 统一进行数据的初始化
     */
    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initListener();

    /**
     * 统一加载数据
     */
    protected abstract void loadData();

    @Override
    protected void onResume() {
        super.onResume();
        App.baseActivity = this;
    }

    /**
     * 统一加载布局
     *
     * @return
     */
    protected abstract int getLayoutId();
}
