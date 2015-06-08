package sample.cdi.bean.decorator;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator @Priority(101)
public class MyDecorator2 implements MyInterface {
    @Inject @Delegate
    private MyInterface delegate;

    @Override
    public void method() {
        System.out.println("my decorator 2");
        System.out.println(delegate.getClass());
        this.delegate.method();
    }
}
