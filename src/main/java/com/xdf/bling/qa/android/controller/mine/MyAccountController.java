package com.xdf.bling.qa.android.controller.mine;


import com.xdf.bling.qa.BaseController;
import com.xdf.bling.qa.android.page.mine.MyAccountPage;
import com.xdf.bling.qa.android.service.mine.MyAccountService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: MyAccountController
 * @Description: 我的-我的账户相关
 * @Author: 王雪松
 * @Date: 2020/7/31 17:09 下午
 */



public class MyAccountController extends BaseController {

    @Test(description = "测试我的账户-我的课程",priority = 1)
    public void testMyAccountController () {
        //进入我的页面
        MyAccountPage myAccountPage = new MyAccountPage((AndroidDriver<MobileElement>) driver);
        MyAccountService myAccountService = new MyAccountService(myAccountPage);
        //执行设置
        myAccountService.myAccountService();


    }

}
