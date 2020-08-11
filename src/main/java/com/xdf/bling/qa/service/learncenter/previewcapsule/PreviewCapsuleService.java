package com.xdf.bling.qa.service.learncenter.previewcapsule;

import com.xdf.bling.qa.page.learncenter.previewcapsule.PreviewCapsulePage;
import org.testng.Assert;

/**
 * @version v1.0
 * @ProjectName: autoTest
 * @ClassName: PreviewCapsuleService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 王雪松
 * @Date: 2020/8/10 17:12 下午
 */
public class PreviewCapsuleService {
    private final PreviewCapsulePage previewCapsulePage;

    public PreviewCapsuleService(PreviewCapsulePage previewCapsulePage) {
        this.previewCapsulePage = previewCapsulePage;
    }

    /**
     * 预习小胶囊
     */
    public void previewCapsuleService() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        previewCapsulePage.swipeCapsule();
        previewCapsulePage.clickCapsule();
    }


    /**
     * 预习小胶囊内部功能
     */
    public void interiorPraiseService() {
        previewCapsulePage.clickPraiseMe();
        //返回
        previewCapsulePage.clickBack();
        previewCapsulePage.clickStabbedMe();
        //返回
        previewCapsulePage.clickBack();

    }

    /**
     * 词句轮轮看
     *
     */
    public void interiorLookAroundService() {
        previewCapsulePage.clickLookAround();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 7; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            previewCapsulePage.clickAhead();
        }
        Assert.assertTrue(previewCapsulePage.isAroundFinish(),"获取闯关完成失败");
        previewCapsulePage.clickNextLevel();


    }

    /**
     *
     * 完成轮轮后开始wordfun
     *
     */
  public void interiorWordFunService() {

      previewCapsulePage.clickWordFunNext();



    }


}
