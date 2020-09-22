package com.xdf.bling.qa.ios.controller;

import com.xdf.bling.qa.BaseController;
import com.xdf.bling.qa.bean.Altert;
import com.xdf.bling.qa.ios.page.AlertByPage;
import com.xdf.bling.qa.ios.service.AlertByPageService;
import com.xdf.bling.qa.util.XmlParse;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.util.Map;

public class AlertByPageController extends BaseController {
    @Test
    public void testAlertByPage() {
        Map<String, String> param = XmlParse.getData("testAlertByPage");

        AlertByPage alertByPage = new AlertByPage((AndroidDriver<MobileElement>) driver);
        AlertByPageService alertByPageService = new AlertByPageService(alertByPage);
        Altert alert = new Altert();
        //增加所有判断参数
        alertByPageService.alertByPageService(
                param.get("switchingCourses"),
                param.get("photoRights"),
                param.get("challengeProgress"),
                param.get("babyTest")
        );

    }

}