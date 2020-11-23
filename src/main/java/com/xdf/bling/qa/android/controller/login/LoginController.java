package com.xdf.bling.qa.android.controller.login;

import com.xdf.bling.qa.bean.Login;
import com.xdf.bling.qa.BaseController;
import com.xdf.bling.qa.listener.AlertPageListener;
import com.xdf.bling.qa.android.page.login.LoginPage;
import com.xdf.bling.qa.android.service.login.LoginService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: LoginCrontroller
 * @Description: TODO(一句话描述该类的功能)
 * @Author: liuzhanhui
 * @Date: 2020/6/15 7:18 下午
 */
@Feature("登录场景")
public class LoginController extends BaseController {

    @Test(retryAnalyzer = AlertPageListener.class, description = "测试手机号和密码登录", dataProvider = "providerMethod")
    //@Test(retryAnalyzer = AlertPageListener.class)
    public void testLogin (Map<String, String> param) throws InterruptedException {
        LoginPage loginPage = new LoginPage((AndroidDriver<MobileElement>) driver);
        LoginService loginService = new LoginService(loginPage);
        Login login = new Login();
        login.setPhone(param.get("phone"));
        login.setPassword(param.get("password"));
        loginService.login(login);
        loginService.assertLoginSuccess();
    }

}
