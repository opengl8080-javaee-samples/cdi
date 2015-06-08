package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.alternative.priority.specialize.MyInterface;
import sample.cdi.bean.alternative.priority.specialize.MyQualifier;
import sample.cdi.bean.alternative.priority.specialize.MyQualifier2;

@Stateless
public class SpecializeEjb {
    @Inject
    private MyInterface obj;
    @Inject @MyQualifier
    private MyInterface qualified;
    @Inject @MyQualifier2
    private MyInterface qualified2;
    
    public void execute() {
        System.out.println("obj.class = " + obj.getClass().getSimpleName());
        System.out.println("qualified.class = " + qualified.getClass().getSimpleName());
        System.out.println("qualified2.class = " + qualified2.getClass().getSimpleName());
    }
}
