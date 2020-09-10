package com.xdf.bling.qa.controller.mine;

import com.xdf.bling.qa.controller.BaseController;
import com.xdf.bling.qa.page.home.HomePage;
import com.xdf.bling.qa.page.mine.SettingPage;
import com.xdf.bling.qa.service.home.HomeService;
import com.xdf.bling.qa.service.mine.SettingService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
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
        HomePage homePage = new HomePage((AndroidDriver<MobileElement>) driver);
        HomeService homePageService = new HomeService(homePage);
        //执行设置
        homePageService.enterMinePageService();
        SettingPage settingPage = new SettingPage((AndroidDriver<MobileElement>) driver);

        SettingService settingService = new SettingService(settingPage);
        settingService.clickSetUpService(params.get("version"),params.get("phone"));
    }


}
