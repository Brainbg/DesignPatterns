package com.brainbg.designpattern.templateMethod;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail
 *     time   : 2019/08/19
 *     desc   :个人简历
 * </pre>
 */
public class PersonalResume2 extends ResumeTemplate {

    @Override
    protected String basicInfomation() {
        return "个人简介2 \n";
    }

    @Override
    protected String educationalBackground() {
        return "教育背景2 \n";
    }

    @Override
    protected String workExperience() {
        return "工作经历2 \n";
    }

    @Override
    protected String skills() {
        return "技能证书2 \n";
    }

    @Override
    protected String selfAssessment() {
        return "自我评价2 \n";
    }

    @Override
    protected String profilePhoto() {
        return "头像2 \n";
    }

    @Override
    protected boolean isNeedProfilePhoto() {
        return false;
    }
}
