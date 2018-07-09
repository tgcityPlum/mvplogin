package com.qcdn.mymvpdemo.modules.login.view;

/**
 * view层的功能接口
 *  获取用户名
 *  获取密码
 *  显示进度条
 *  隐藏进度条
 *  登录成功
 *  登录失败
 */
public interface LoginView {
    String getName();
    String getPassword();

    void showProgress();
    void dismissProgress();

    void successModify(String data);
    void errorModify(String data);
}
