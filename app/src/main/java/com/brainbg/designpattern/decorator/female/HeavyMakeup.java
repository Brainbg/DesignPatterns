package com.brainbg.designpattern.decorator.female;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
public class HeavyMakeup extends Makeup {

    public HeavyMakeup(Female mFemale) {
        super(mFemale);
    }

    /**
     * 画眉
     */
    private void thrush() {
        System.out.println("画个眉毛");
    }

    /**
     * 粉底
     */
    private void foundation() {
        System.out.println("打个粉底");
    }

    /**
     * 口红
     */
    private void lipstick() {
        System.out.println("涂个口红");
    }


    @Override
    public void primp() {
        super.primp();
        System.out.println("准备画个浓妆！");
        thrush();
        foundation();
        lipstick();
    }
}
