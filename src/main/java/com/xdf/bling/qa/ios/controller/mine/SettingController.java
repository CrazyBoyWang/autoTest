package com.xdf.bling.qa.ios.controller.mine;

import com.xdf.bling.qa.BaseController;
import com.xdf.bling.qa.ios.page.home.HomePage;
import com.xdf.bling.qa.ios.page.mine.SettingPage;
import com.xdf.bling.qa.ios.service.home.HomeService;
import com.xdf.bling.qa.ios.service.mine.SettingService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: MineController
 * @Description: TODO(一句话描述该类的功能)
 * @Author: liuzhanhui
 * @Date: 2020/6/16 3:29 下午
 */
public class SettingController extends BaseController {

    @Test(description = "测试我的-进入设置页面",dataProvider = "providerMethod",priority = 1)
    public void testEnterSettingPage (Map<String,String> params) {
        //进入我的页面
        HomePage homePage = new HomePage((IOSDriver<MobileElement>) driver);
        HomeService homePageService = new HomeService(homePage);
        //执行设置
        homePageService.enterMinePageService();
        SettingPage settingPage = new SettingPage((IOSDriver<MobileElement>) driver);

        SettingService settingService = new SettingService(settingPage);
        settingService.clickSetUpService(params.get("version"),params.get("phone"));
    }


}
