package com.xdf.bling.qa.ios.controller.login;

import com.xdf.bling.qa.BaseController;
import com.xdf.bling.qa.bean.Login;
import com.xdf.bling.qa.ios.page.login.LoginPage;
import com.xdf.bling.qa.ios.service.login.LoginService;
import com.xdf.bling.qa.listener.AlertPageListener;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
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
@Feature("全流程操作")
public class LoginController extends BaseController {

    @Test(retryAnalyzer = AlertPageListener.class, description = "测试手机号和密码登录", dataProvider = "providerMethod")
    //@Test(retryAnalyzer = AlertPageListener.class)
    public void testLogin (Map<String, String> param) {
        LoginPage loginPage = new LoginPage((IOSDriver<MobileElement>) driver);
        LoginService loginService = new LoginService(loginPage);
        Login login = new Login();
        login.setPhone(param.get("phone"));
        login.setPassword(param.get("password"));
        loginService.login(login);
        loginService.assertLoginSuccess();
    }

}
