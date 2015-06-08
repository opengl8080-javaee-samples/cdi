package sample.cdi.bean;

import javax.enterprise.context.Dependent;

@Dependent
public class HelloBean implements MyInterface {

    @Override
    public void method() {
        System.out.println("Hello CDI!!");
    }
}
