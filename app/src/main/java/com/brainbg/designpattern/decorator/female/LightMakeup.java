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
    private void cleansing() {
        System.out.println("洁面");
    }

    /**
     * 爽肤水
     */
    private void toner() {
        System.out.println("抹点爽肤水");
    }

    /**
     * 面霜
     */
    private void cream() {
        System.out.println("涂个面霜");
    }


    @Override
    public void primp() {
        super.primp();
        System.out.println("准备画个淡妆！");
        cleansing();
        toner();
        cream();

    }
}
