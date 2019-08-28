package com.brainbg.designpattern.templateMethod;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail
 *     time   : 2019/08/19
 *     desc   :简历模板
 *    1.个人简介
 *    2.教育背景
 *    3.工作经历
 *    4.技能证书
 *    5.自我评价
 * </pre>
 */
public abstract class ResumeTemplate {
    protected abstract String basicInfomation();

    protected abstract String educationalBackground();

    protected abstract String workExperience();

    protected abstract String skills();

    protected abstract String selfAssessment();


    protected abstract String profilePhoto();

    protected boolean isNeedProfilePhoto() {
        return false;
    }


    /**
     * 生成简历
     */
    public final String createResume() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.basicInfomation())
                .append(this.educationalBackground())
                .append(this.workExperience())
                .append(this.skills())
                .append(this.selfAssessment());

        if (isNeedProfilePhoto()) {
            sb.append(profilePhoto());
        }
        return sb.toString();
    }
}
