package com.xdf.bling.qa.service.mine;

import com.xdf.bling.qa.page.mine.LogisticsMsgPage;
import com.xdf.bling.qa.page.mine.SettingPage;
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
    public void logisticsMsgService() {
        logisticsMsgPage.clickLogisticsMsg();


    }


}
