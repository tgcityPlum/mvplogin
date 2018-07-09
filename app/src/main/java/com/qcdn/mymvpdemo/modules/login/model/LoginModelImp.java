package com.qcdn.mymvpdemo.modules.login.model;

import com.qcdn.mymvpdemo.modules.login.presenter.LoginPresenterImp;

/**
 * model层的登录接口
 */
public interface LoginModelImp {

    void login(String name, String password, LoginPresenterImp loginPresenterImp);
}
