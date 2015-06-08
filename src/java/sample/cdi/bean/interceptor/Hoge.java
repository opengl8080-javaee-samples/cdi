package sample.cdi.bean.interceptor;

import javax.enterprise.context.Dependent;

@Dependent
public class Hoge {
    
    @MyIntercept
    public void method() {
        System.out.println("Hoge#method()");
    }
}
