package com.xdf.bling.qa.service.learncenter.previewcapsule;

import com.xdf.bling.qa.page.learncenter.previewcapsule.PreviewCapsulePage;

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
    public void previewCapsuleService(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        previewCapsulePage.swipeCapsule();
        previewCapsulePage.clickCapsule();
    }


}
