package com.brainbg.designpattern.templateMethod;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail
 *     time   : 2019/08/19
 *     desc   :个人简历
 * </pre>
 */
public class PersonalResume1 extends ResumeTemplate {

    @Override
    protected String basicInfomation() {
        return "个人简介1 \n";
    }

    @Override
    protected String educationalBackground() {
        return "教育背景1 \n";
    }

    @Override
    protected String workExperience() {
        return "工作经历1 \n";
    }

    @Override
    protected String skills() {
        return "技能证书1 \n";
    }

    @Override
    protected String selfAssessment() {
        return "自我评价1 \n";
    }

    @Override
    protected String profilePhoto() {
        return "头像1 \n";
    }

    @Override
    protected boolean isNeedProfilePhoto() {
        return true;
    }

}
