package com.brainbg.designpattern.visitor;

/**
 * <pre>
 *     author : brainbg
 *     e-mail : brainbg@foxmail.com
 *     time   : 2019/10/14
 *     desc   :
 * </pre>
 */
public interface IVisitor {

     public  void  visit(ConcreteElementA elementA);
     public void visit(ConcreteElementB   elementB);

}
