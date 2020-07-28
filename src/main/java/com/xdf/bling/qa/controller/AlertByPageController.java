package com.xdf.bling.qa.controller;

import com.xdf.bling.qa.bean.Altert;
import com.xdf.bling.qa.page.AlertByPage;
import com.xdf.bling.qa.service.AlertByPageService;
import com.xdf.bling.qa.util.XmlParse;
import org.testng.annotations.Test;

import java.util.Map;

public class AlertByPageController extends BaseController {
    @Test
    public void testAlertByPage() {
        Map<String, String> param = XmlParse.getData("testAlertByPage");

        AlertByPage alertByPage = new AlertByPage(driver);
        AlertByPageService alertByPageService = new AlertByPageService(alertByPage);
        Altert alert = new Altert();
        //增加所有判断参数

        alertByPageService.alertByPageService(
                param.get("timetableCourse"),
                param.get("switchingCourses"),
                param.get("photoRights"),
                param.get("agreement"),
                param.get("homePageTipsLr"),
                param.get("challengeProgress")
        );

    }

}