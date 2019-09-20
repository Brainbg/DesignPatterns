package com.brainbg.designpattern.decorator.commonCode;

/**
 * <pre>
 *     author : Brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/09/20
 *     desc   :
 * </pre>
 */
class ConcreteComponent extends Component {

    @Override
    public void operate() {
        //具体业务逻辑
        System.out.println("具体组件的业务逻辑");
    }

}
