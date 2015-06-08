package sample.cdi.bean.interceptor;

import javax.enterprise.context.Dependent;

@Dependent
@OptionalIntercept
public class Fuga {

    public void method1() {
        System.out.println("method1");
    }
    
    @OptionalIntercept(false)
    public void method2() {
        System.out.println("method2");
    }
}
