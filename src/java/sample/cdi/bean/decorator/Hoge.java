package sample.cdi.bean.decorator;

import javax.enterprise.context.Dependent;

@Dependent
public class Hoge implements MyInterface {
    
    @Override
    public void method() {
        System.out.println("Hoge#method1()");
    }
}
