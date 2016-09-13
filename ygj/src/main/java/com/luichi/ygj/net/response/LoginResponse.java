package com.luichi.ygj.net.response;

import com.luichi.ygj.model.User;
import com.luichi.ygj.net.response.base.BaseResponse;

/**
 * Created by han_l on 2016/9/13.
 */

public class LoginResponse extends BaseResponse {
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
