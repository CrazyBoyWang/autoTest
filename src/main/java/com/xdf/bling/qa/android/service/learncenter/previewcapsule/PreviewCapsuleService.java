package com.xdf.bling.qa.android.service.learncenter.previewcapsule;

import com.xdf.bling.qa.android.page.learncenter.previewcapsule.PreviewCapsulePage;
import org.testng.Assert;

import static java.lang.Thread.sleep;

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
    public void previewCapsuleService() throws InterruptedException {
        sleep(2000);
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
     */
    public void interiorLookAroundService() throws InterruptedException {
        previewCapsulePage.clickLookAround();
        sleep(4000);
        for (int i = 0; i < 7; i++) {
            sleep(5000);
            previewCapsulePage.clickAhead();
        }
        Assert.assertTrue(previewCapsulePage.isAroundFinish(), "获取闯关完成失败");
        previewCapsulePage.clickNextLevel();


    }

    /**
     * 完成轮轮后开始wordfun
     * 现在获取地址不好获取。稍后在写
     */
    public void interiorWordFunService() throws InterruptedException {
        sleep(3000);
        for (int i = 0; i < 5; i++) {
            sleep(5000);
            previewCapsulePage.clickWordFunNext();

        }

    }

    /**
     * 开始知识小预热
     *
     */
    public void KnowledgePreheatingService() throws InterruptedException {

        sleep(2000);
        previewCapsulePage.clickBackInClass();
        previewCapsulePage.clickKnowledgePreheating();

        for (int i = 0; i < 10; i++) {
            sleep(6000);
            previewCapsulePage.clickAhead();
        }
        Assert.assertTrue(previewCapsulePage.isAroundFinish(), "获取闯关完成失败");
        previewCapsulePage.clickNextLevel();
    }


    /**
     * Look and Listen
     */

    public void LookAndListenService() throws InterruptedException {
//        for (int i = 0; i < 2; i++) {
//           previewCapsulePage.clickChangeCode();
//        }
        sleep(2000);
        for (int i = 0; i < 10; i++) {
            sleep(1000);
            previewCapsulePage.clickTurn();
        }
        Assert.assertTrue(previewCapsulePage.isAroundFinish(), "获取闯关完成失败");
        previewCapsulePage.clickNextLevel();

    }

    /**
     * 完成视频
     * @throws InterruptedException
     */

    public void finshVideoService() throws InterruptedException {
        sleep(1000);
        Assert.assertTrue(previewCapsulePage.isFinshVideo(), "视频未读取完成或读取失败");
        previewCapsulePage.clickFinshVideo();
        Assert.assertTrue(previewCapsulePage.isPrepareSucess(), "获取闯关完成失败");
        sleep(1000);
        previewCapsulePage.clickLearnRank();
        Assert.assertTrue(previewCapsulePage.isLearnRank(), "判断排行列表成功");
        previewCapsulePage.clickRankClose();
        previewCapsulePage.clickBackInClass();
//        sleep(2000);
//        previewCapsulePage.clickBackClasses();
    }
}