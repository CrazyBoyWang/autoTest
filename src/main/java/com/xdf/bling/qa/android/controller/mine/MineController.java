package com.xdf.bling.qa.android.controller.mine;

import com.xdf.bling.qa.BaseController;
import com.xdf.bling.qa.android.page.home.HomePage;
import com.xdf.bling.qa.android.page.mine.MinePage;
import com.xdf.bling.qa.android.service.home.HomeService;
import com.xdf.bling.qa.android.service.mine.MineService;
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
public class MineController extends BaseController {

    @Test(description = "测试进入我的页面",priority = 1)
    public void testEnterMinePage () {
        HomePage homePage = new HomePage((AndroidDriver<MobileElement>) driver);
        HomeService homeService = new HomeService(homePage);
        //homeService.swipeHomePageService();
        homeService.enterMinePageService();
        MinePage minePage = new MinePage((AndroidDriver<MobileElement>) driver);
        MineService mineService = new MineService(minePage);
        mineService.verifyEnterMinePageService();
    }

    @Test(description = "测试宝贝页面", dataProvider = "providerMethod", priority = 2)
    public void TestBabyPage (Map<String, String> param) {
        MinePage minePage = new MinePage((AndroidDriver<MobileElement>) driver);
        MineService mineService = new MineService(minePage);
        mineService.verifyEnterBabyPageService();
        mineService.verityEnterMineInfoPage();
        mineService.verifyChangeAvatar();
        mineService.changeBabyEnglishNameService(param.get("englishName"));
//        mineService.changeBabyChineseNameService(param.get("chineseName"));
        mineService.changeBabyGenderService();
        mineService.changeUserName(param.get("userName"));
        mineService.changeLocation();
    }

}
