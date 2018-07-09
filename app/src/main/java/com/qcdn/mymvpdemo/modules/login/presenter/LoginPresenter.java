package com.qcdn.mymvpdemo.modules.login.presenter;

import com.qcdn.mymvpdemo.modules.login.model.LoginModel;
import com.qcdn.mymvpdemo.modules.login.view.LoginView;

/**
 * presenter层 -- 登录功能实现
 *  需要view层相关数据
 *  请求model层数据
 *  针对返回结果的处理
 */
public class LoginPresenter implements LoginPresenterImp{
    //获取用户输入信息
    private LoginView loginView;
    //获取请求返回值
    private LoginModel loginModel;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
        loginModel = new LoginModel();
    }

    public void login(){
        loginView.showProgress();
        //需要view层相关数据
        //请求model层数据
        loginModel.login(loginView.getName(),loginView.getPassword(),this);
    }

    @Override
    public void onSuccess(String data) {
        loginView.successModify(data);
        loginView.dismissProgress();
    }

    @Override
    public void onError(String data) {
        loginView.errorModify(data);
        loginView.dismissProgress();
    }
}
