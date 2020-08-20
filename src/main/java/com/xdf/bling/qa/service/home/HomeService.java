package com.xdf.bling.qa.service.home;

import com.xdf.bling.qa.page.home.HomePage;
import org.testng.Assert;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: LoginService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: liuzhanhui
 * @Date: 2020/6/15 7:13 下午
 */
public class HomeService {

    private final HomePage homePage;

    public HomeService(HomePage homePage) {
        this.homePage = homePage;
    }

    /**
     * 进入我的页面
     */
    public void enterMinePageService() {
        homePage.clickMineTab();
    }

    /**
     * 我的老师
     */
    public void enterMyTeacher() throws InterruptedException {
        homePage.clickMyTeacher();
        Assert.assertTrue(homePage.isMyTeacher(), "进入我的老师页面失败");
        homePage.swipeMyTeacher();
        for (int i = 0; i < 3 ; i++) {
            homePage.swipeDownTeacher();

        }
    }


    public void swipeHomePageService() {
        homePage.swipeHomePage();
    }
}
