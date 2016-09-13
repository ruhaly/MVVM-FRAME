package com.luichi.ygj;

import android.view.View;

import com.luichi.ygj.databinding.ActivityMainBinding;
import com.luichi.ygj.ui.base.BaseActivity;
import com.luichi.ygj.utils.L;
import com.luichi.ygj.utils.Utils;

public class StartActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        dataBinding.button.setText("你好");

    }

    public void dClick(View view) {
        L.e("马天");
        Utils.snack(this, "asdfasdf");
    }

}
