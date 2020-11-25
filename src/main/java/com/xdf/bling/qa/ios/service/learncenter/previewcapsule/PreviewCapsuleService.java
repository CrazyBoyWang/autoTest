package com.xdf.bling.qa.ios.service.learncenter.previewcapsule;

import com.xdf.bling.qa.ios.page.learncenter.previewcapsule.PreviewCapsulePage;
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
        sleep(3000);
        previewCapsulePage.swipeCapsule();
        sleep(1000);
        previewCapsulePage.clickCapsule();
    }
    /**
     * 预习小胶囊内部功能
     * 攒过我和戳过我
     */
    public void interiorPraiseService() {
        previewCapsulePage.clickPraiseMe();
        //返回
        previewCapsulePage.goBack();
        previewCapsulePage.clickStabbedMe();
        //返回
        previewCapsulePage.goBack();

    }

    /**
     * 词句轮轮看
     */
    public void interiorLookAroundService() throws InterruptedException {
        previewCapsulePage.clickLookAround();
        Thread.sleep(5000);
        previewCapsulePage.clickAuto();

        previewCapsulePage.clickAutoStart();

//        sleep(4000);
//        for (int i = 0; i < 7; i++) {
//            sleep(5000);
//            previewCapsulePage.clickAhead();
//        }
        previewCapsulePage.clickCrossAuto();
        Assert.assertTrue(previewCapsulePage.isAroundFinish(), "获取闯关完成失败");
        previewCapsulePage.clickNextLevel();


    }

    /**
     * 完成轮轮后开始wordfun
     *
     */
    public void interiorWordFunService() throws InterruptedException {
            sleep(5000);
            previewCapsulePage.clickWordFunNextOne();
            sleep(3000);
            previewCapsulePage.clickWordFunNextTwo();
            sleep(3000);
            previewCapsulePage.clickWordFunNextTwo();

        Assert.assertTrue(previewCapsulePage.isAroundFinish(), "获取闯关完成失败");
        previewCapsulePage.clickNextLevel();

    }

    /**
     * 开始知识小预热
     *
     */
    public void KnowledgePreheatingService() throws InterruptedException {

        sleep(3000);
        previewCapsulePage.clickAuto();
        previewCapsulePage.clickAutoStart();
        previewCapsulePage.clickCrossAuto();

        Assert.assertTrue(previewCapsulePage.isAroundFinish(), "获取闯关完成失败");
        previewCapsulePage.clickNextLevel();


//        previewCapsulePage.clickBackInClass();
//        previewCapsulePage.clickKnowledgePreheating();
//        for (int i = 0; i < 10; i++) {
//            sleep(5000);
//            previewCapsulePage.clickAhead();
//        }
//        Assert.assertTrue(previewCapsulePage.isAroundFinish(), "获取闯关完成失败");
//        previewCapsulePage.clickNextLevel();

    }


    /**
     * Look and Listen
     */

    public void LookAndListenService() throws InterruptedException {
        Assert.assertTrue(previewCapsulePage.isLookAndListen(),"未找到播放文字，请检查是否进入界面");
        Thread.sleep(5000);
        previewCapsulePage.autoLookAndListen();
//        for (int i = 0; i < 2; i++) {
//            previewCapsulePage.clickChangeCode();
//        }
//        for (int i = 0; i < 10; i++) {
//            sleep(1000);
//            previewCapsulePage.clickTurn();
//        }
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
        sleep(2000);
        previewCapsulePage.clickFinshVideo();
        Assert.assertTrue(previewCapsulePage.isPrepareSucess(), "获取闯关完成失败");
        sleep(5000);
        previewCapsulePage.clickLearnRank();
        Assert.assertTrue(previewCapsulePage.isLearnRank(), "判断排行列表成功");
        sleep(2000);
        previewCapsulePage.clickRankClose();
        previewCapsulePage.clickBackInClass();
        previewCapsulePage.clickBackClasses();
    }
}