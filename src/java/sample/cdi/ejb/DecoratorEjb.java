package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.decorator.MyInterface;

@Stateless
public class DecoratorEjb {
    @Inject
    private MyInterface obj;
    
    public void execute() {
        this.obj.method();
    }
}
