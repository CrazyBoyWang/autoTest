package com.xdf.bling.qa.service.mine;

import com.xdf.bling.qa.page.mine.MinePage;
import com.xdf.bling.qa.page.mine.SettingPage;
import io.appium.java_client.Setting;
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

    public void clickSetUpService(String version){
        settingPage.clickSetUp();
        Assert.assertTrue(settingPage.isPresentLogoutButton(), "进入设置页面失败");
        settingPage.CleanCache();
        Assert.assertTrue(settingPage.isShowToastCleanCache(),"清理未成功");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        settingPage.CheckUpdate();
        Assert.assertTrue(settingPage.isShowToastCheckUpdate(),"版本信息获取失败");
        Assert.assertTrue(settingPage.checkVersionText(version),"版本号不一致");


    }



}
