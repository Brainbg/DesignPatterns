package com.brainbg.designpattern.decorator.female;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
public class LightMakeup extends Makeup {
    public LightMakeup(Female mFemale) {
        super(mFemale);
    }

    /**
     * 洁面
     */
    public void cleansing() {
        System.out.println("洁个面");
    }

    /**
     * 爽肤水
     */
    public void toner() {
        System.out.println("抹点爽肤水");
    }

    /**
     * 面霜
     */
    public void cream() {
        System.out.println("涂个面霜");
    }


    @Override
    public void primp() {
        super.primp();
        cleansing();
        toner();
        cream();

    }
}
