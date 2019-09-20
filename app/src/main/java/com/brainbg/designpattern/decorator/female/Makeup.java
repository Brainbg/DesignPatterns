package com.brainbg.designpattern.decorator.female;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
public class Makeup extends Female {
    private Female mFemale;

    public Makeup(Female mFemale) {
        this.mFemale = mFemale;
    }

    @Override
    public void primp() {
        this.mFemale.primp();
    }
}
