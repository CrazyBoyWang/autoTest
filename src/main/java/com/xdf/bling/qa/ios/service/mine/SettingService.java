package com.xdf.bling.qa.ios.service.mine;

import com.xdf.bling.qa.ios.page.mine.SettingPage;
import org.testng.Assert;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: LoginService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: liuzhanhui
 * @Date: 2020/6/15 7:13 下午
 */
public class SettingService {

    private final SettingPage settingPage;

    public SettingService( SettingPage settingPage) {
        this.settingPage = settingPage;
    }

    /**
     * 我的-进入设置
     *
     *
     * */

    public void clickSetUpService(String version,String phone){
        settingPage.clickMineTab();
        settingPage.clickSetUp();
     //   Assert.assertTrue(settingPage.isPresentLogoutButton(), "进入设置页面失败");
        settingPage.accountSecurity();
        Assert.assertTrue(settingPage.isShowToastAccount(phone));
        settingPage.goBack();
        settingPage.CleanCache();
        Assert.assertTrue(settingPage.isShowToastCleanCache(),"清理未成功");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        settingPage.aboutUs();
        Assert.assertTrue(settingPage.isPresentAboutUs(),"进入关于界面失败");
        settingPage.goBack();
//        检查更新
 //       settingPage.CheckUpdate();
 //       Assert.assertTrue(settingPage.isShowToastCheckUpdate(),"版本信息获取失败");
//        Assert.assertTrue(settingPage.checkVersionText(version),"版本号不一致");
    }

}
