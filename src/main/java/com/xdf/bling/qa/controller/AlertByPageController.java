package com.xdf.bling.qa.controller;

import com.xdf.bling.qa.bean.Login;
import com.xdf.bling.qa.page.AlertByPage;
import com.xdf.bling.qa.page.login.LoginPage;
import com.xdf.bling.qa.service.login.LoginService;
import com.xdf.bling.qa.bean.Altert;
import org.testng.annotations.Test;

import java.util.Map;

public class AlertByPageController extends BaseController {









    @Test(description = "判断弹窗信息", dataProvider = "providerMethod")
    public void testAlertByPage (Map<String, String> param) {
        AlertByPage alertByPage = new AlertByPage(super.driver);
//      LoginService loginService = new LoginService(loginPage);
        Altert alert = new Altert();
        //加server
        alertByPage.isSwitchingCourses(param.get("switchingCourses"));
    }

}
