package com.xdf.bling.qa.ios.service.mine;


import com.xdf.bling.qa.ios.page.mine.MyAccountPage;
import org.testng.Assert;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: MyAccountService
 * @Description: 我的-我的账户相关
 * @Author: 王雪松
 * @Date: 2020/7/31 17:00 下午
 */

public class MyAccountService {
    private final MyAccountPage myAccountPage;
    public MyAccountService(MyAccountPage myAccountPage) {
        this.myAccountPage = myAccountPage;
    }


    //设定执行流程
    public void myAccountService() throws InterruptedException {
        myAccountPage.clickMineTab();
        Thread.sleep(4000);
        myAccountPage.clickMyCourse();
        Assert.assertTrue(myAccountPage.isMyCourse(), "进入我的课程失败");
        myAccountPage.clickClassStarted();
        myAccountPage.clickClasses();
        Assert.assertTrue(myAccountPage.isCourseDetails(),"进入课程详情失败");
        myAccountPage.goBack();
        myAccountPage.clickClassNoStarted();
        myAccountPage.clickClasses();
        Thread.sleep(3000);
        myAccountPage.goBack();
        myAccountPage.goBack();


    //    myAccountPage.clickCourseDetails();


//        myAccountPage.clickMineTab();
//        myAccountPage.clickMyCourse();


    }
}
