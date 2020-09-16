package com.xdf.bling.qa.ios.controller.mine;

import com.xdf.bling.qa.BaseController;
import com.xdf.bling.qa.ios.page.mine.LogisticsMsgPage;
import com.xdf.bling.qa.ios.service.mine.LogisticsMsgService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: LogisticsMsgController
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 王雪松
 * @Date: 2020/7/22 3:29 下午
 */
public class LogisticsMsgController extends BaseController {

    @Test(description = "测试我的-物流信息", priority = 1)
    public void testLogisticsMsgPage() throws InterruptedException {
        //进入物流信息
        //    LogisticsMsgController logisticsMsgController = new LogisticsMsgController(driver);
        LogisticsMsgPage logisticsMsgPage = new LogisticsMsgPage((IOSDriver<MobileElement>) driver);
        LogisticsMsgService logisticsMsgService = new LogisticsMsgService(logisticsMsgPage);
        logisticsMsgService.logisticsMsgService();

    }


}
