package com.qcdn.mymvpdemo.modules.login.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.qcdn.mymvpdemo.R;
import com.qcdn.mymvpdemo.modules.login.presenter.LoginPresenter;

/**
 * view层的登录activity
 *  声明控件
 *  实现逻辑功能(获取用户名，获取密码，显示进度条，隐藏进度条)
 *  登录事件
 *  登录结果的逻辑处理
 */
public class LoginActivity extends AppCompatActivity implements LoginView{
    private EditText mName;
    private EditText mPassword;
    private Button mLogin;
    private ProgressBar mProgressBar;
    //初始化presenter层对象
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initViews();

        initListener();
    }

    /**
     * 实现登录的点击事件
     */
    private void initListener() {
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //在presenter层实现登录功能
                loginPresenter.login();
            }
        });
    }

    /**
     * 声明控件
     */
    private void initViews() {
        mName = findViewById(R.id.et_name);
        mPassword = findViewById(R.id.et_password);
        mLogin = findViewById(R.id.btn_login);
        mProgressBar = findViewById(R.id.mProgressBar);

        loginPresenter = new LoginPresenter(this);
    }

    @Override
    public String getName() {
        return mName.getText().toString();
    }

    @Override
    public String getPassword() {
        return mPassword.getText().toString();
    }

    @Override
    public void showProgress() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissProgress() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void successModify(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void errorModify(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}
