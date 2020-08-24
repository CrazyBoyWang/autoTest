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
    public void enterMyTeacherService() throws InterruptedException {
        homePage.clickMyTeacher();
        Assert.assertTrue(homePage.isMyTeacher(), "进入我的老师页面失败");
        homePage.swipeMyTeacher();
        for (int i = 0; i < 3; i++) {
            homePage.swipeDownTeacher();
        }
        homePage.clickBacks();
    }


    /**
     * banner相关操作
     */
    public void bannerAboutService() throws InterruptedException {
        homePage.clickBanner();
        Thread.sleep(5000);
        homePage.clickSystemBack();
    }

    /**
     * 比邻公开课
     */
    public void blingOpenClassService() throws InterruptedException {
        Thread.sleep(2000);
        //   homePage.swipeBlingOpenClass();
        for (int i = 0; i <2 ; i++) {
            homePage.swipeDownTeacher();

        }
        Assert.assertTrue(homePage.isBlingOpenClass(), "界面中没有比邻公开课内容");

        homePage.clickOpenMoreClass();
        Thread.sleep(1000);
        homePage.clickBack();
        //   homePage.clickBack();

    }

    /**
     * 比邻绘本
     */
    public void blingPictureBookService() throws InterruptedException {
        homePage.swipeHomePage();
        Assert.assertTrue(homePage.isPictureBook(), "获取绘本失败");
        homePage.clickPictureBook();
        Thread.sleep(1000);
        for (int i = 0; i < 3; i++) {
            homePage.swipePictureBook();
        }
        homePage. clickBack();

    }

    /**
     *
     * 课表相关
     */
    public void classListService() throws InterruptedException {
        Assert.assertTrue(homePage.isDateList(),"获取课表列表失败");
        homePage.clickClassList();
        Thread.sleep(1000);
        homePage.clickDateList();
        for (int i = 0; i < 5 ; i++) {
            homePage.clickDate();
        }
        homePage.clickBack();
    }
    public void swipeHomePageService() {
        homePage.swipeHomePage();


    }
}
