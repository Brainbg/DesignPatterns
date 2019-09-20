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
    public void thrush() {
        System.out.println("画个眉毛");
    }

    /**
     * 粉底
     */
    public void foundation() {
        System.out.println("打个粉底");
    }

    /**
     * 口红
     */
    public void lipstick() {
        System.out.println("涂个口红");
    }


    @Override
    public void primp() {
        super.primp();
        thrush();
        foundation();
        lipstick();
    }
}
