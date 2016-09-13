package com.luichi.ygj;

import android.app.Application;

import com.luichi.ygj.utils.L;

import static com.luichi.ygj.utils.L.makeLogTag;

/**
 * Created by han_l on 2016/9/13.
 */

public class YGJApplication extends Application {

    private static final String TAG = makeLogTag(YGJApplication.class);

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        L.init(TAG);
    }
}
