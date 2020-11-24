package com.xdf.bling.qa.android.service.mine;

import com.xdf.bling.qa.android.page.mine.LogisticsMsgPage;
import org.testng.Assert;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: LogisticsMsgService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 王雪松
 * @Date: 2020/7/22 16:13 下午
 */
public class LogisticsMsgService {

    private final LogisticsMsgPage logisticsMsgPage;

    public LogisticsMsgService(LogisticsMsgPage logisticsMsgPage) {
        this.logisticsMsgPage = logisticsMsgPage;
    }

    /**
     * 我的-物流信息
     */
    public void logisticsMsgService() throws InterruptedException {
        logisticsMsgPage.clickMineTab();
        Thread.sleep(1000);
        logisticsMsgPage.clickLogisticsMsg();
        Assert.assertTrue(logisticsMsgPage.isLogisticsMsg(), "进入物流查询页面失败");
        //  logisticsMsgPage.clickLogisticsList();
        Thread.sleep(1000);
        logisticsMsgPage.swipeUpList();
        Thread.sleep(2000);
        logisticsMsgPage.clickBackLogistics();


    }


}
