package sample.cdi.bean.decorator;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator @Priority(100)
public class MyDecorator1 implements MyInterface {
    @Inject @Delegate
    private MyInterface delegate;

    @Override
    public void method() {
        System.out.println("my decorator 1");
        this.delegate.method();
    }
}
