package com.xdf.bling.qa.ios.controller.mine;


import com.xdf.bling.qa.BaseController;
import com.xdf.bling.qa.ios.page.mine.MyAccountPage;
import com.xdf.bling.qa.ios.service.mine.MyAccountService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: MyAccountController
 * @Description: 我的-我的账户相关
 * @Author: 王雪松
 * @Date: 2020/9/16 17:09 下午
 */



public class MyAccountController extends BaseController {

    @Test(description = "测试我的账户-我的课程",priority = 1)
    public void testMyAccountController () throws InterruptedException {
        //进入我的页面
        MyAccountPage myAccountPage = new MyAccountPage((IOSDriver<MobileElement>) driver);
        MyAccountService myAccountService = new MyAccountService(myAccountPage);
        //执行设置
        myAccountService.myAccountService();
    }
}
