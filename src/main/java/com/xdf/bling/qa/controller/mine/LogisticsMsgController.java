package com.xdf.bling.qa.controller.mine;

import com.xdf.bling.qa.controller.BaseController;
import com.xdf.bling.qa.page.home.HomePage;
import com.xdf.bling.qa.page.mine.LogisticsMsgPage;
import com.xdf.bling.qa.page.mine.SettingPage;
import com.xdf.bling.qa.service.home.HomeService;
import com.xdf.bling.qa.service.mine.LogisticsMsgService;
import com.xdf.bling.qa.service.mine.SettingService;
import org.testng.annotations.Test;

import java.util.Map;

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
    public void testLogisticsMsgPage() {
        //进入物流信息
        //    LogisticsMsgController logisticsMsgController = new LogisticsMsgController(driver);
        LogisticsMsgPage logisticsMsgPage = new LogisticsMsgPage(driver);
        LogisticsMsgService logisticsMsgService = new LogisticsMsgService(logisticsMsgPage);
        logisticsMsgService.logisticsMsgService();

    }


}
