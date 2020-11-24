package com.xdf.bling.qa.android.service.mine;


import com.xdf.bling.qa.android.page.mine.BlingShopPage;
import org.testng.Assert;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: MyAccountService
 * @Description: 我的-我的账户相关
 * @Author: 王雪松
 * @Date: 2020/7/31 17:00 下午
 */

public class BlingShopService {
    private final BlingShopPage blingShopPage;

    public BlingShopService(BlingShopPage blingShopPage) {
        this.blingShopPage = blingShopPage;
    }



    public void blingShopService() {
        blingShopPage.clickMineTab();
        blingShopPage.clickShopPage();
        Assert.assertTrue(blingShopPage.isShopPage(), "//进入商城页面失败");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        blingShopPage.clickBackShop();

       // myOrderPage.clickAllOrderList();
    }
}
