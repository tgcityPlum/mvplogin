package com.qcdn.mymvpdemo.modules.login.presenter;

/**
 * presenter层登录接口
 *  登录结果的处理
 */
public interface LoginPresenterImp {

    void onSuccess(String data);
    void onError(String data);
}
