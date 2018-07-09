package com.qcdn.mymvpdemo.modules.login.model;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.qcdn.mymvpdemo.base.HttpUtil;
import com.qcdn.mymvpdemo.modules.login.presenter.LoginPresenterImp;

import cz.msebera.android.httpclient.Header;

/**
 * model层的登录逻辑
 *  实现登录
 */
public class LoginModel implements LoginModelImp{

    @Override
    public void login(String name, String password, final LoginPresenterImp loginPresenterImp) {
        HttpUtil.post("", new RequestParams(), new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {
                loginPresenterImp.onSuccess("success");
            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {
                loginPresenterImp.onError("error");
            }
        });
    }
}
