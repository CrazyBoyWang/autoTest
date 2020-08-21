package com.xdf.bling.qa.controller.home;

import com.xdf.bling.qa.controller.BaseController;
import com.xdf.bling.qa.page.home.HomePage;
import com.xdf.bling.qa.service.home.HomeService;
import org.testng.annotations.Test;

/**
 * @author: wangxuesong
 * @description:TODO
 * @date: 2020/8/20 10:09 上午
 */
public class HomeController extends BaseController {
    @Test(description = "主页--首页相关操作", priority = 1)
    public void testHomeController() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        HomeService homeService = new HomeService(homePage);
        homeService.enterMyTeacherService();
        homeService.bannerAboutService();
        homeService.blingOpenClassService();
        // 首页相关信息
        homeService.blingPictureBookService();
        //课表
        homeService.classListService();

    }

}
