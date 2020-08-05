package com.xdf.bling.qa.controller.mine;


import com.xdf.bling.qa.controller.BaseController;
import com.xdf.bling.qa.page.mine.MyAccountPage;
import com.xdf.bling.qa.service.mine.MyAccountService;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: MyAccountController
 * @Description: 我的-我的账户相关
 * @Author: 王雪松
 * @Date: 2020/7/31 17:09 下午
 */



public class MyAccountController extends BaseController {

    @Test(description = "测试我的账户-设置-我的课程",dataProvider = "providerMethod",priority = 1)
    public void testMyAccountController (Map<String,String> params) {
        //进入我的页面
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountService myAccountService = new MyAccountService(myAccountPage);
        //执行设置
        myAccountService.myAccountPage();


    }

}
