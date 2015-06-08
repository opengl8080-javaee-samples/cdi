package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import sample.cdi.bean.qualifier.defaultany.MyInterface;
import sample.cdi.bean.qualifier.defaultany.MyQualifier;

@Stateless
public class DefaultAnyEjb {
    
    @Inject
    private MyInterface onlyInject;
    @Inject @Default
    private MyInterface withDefault;
    @Inject @Default @Any
    private MyInterface withDefaultAndAny;
    @Inject @MyQualifier
    private MyInterface withQualifier;
    
    public void execute() {
        System.out.println("onlyInject.class = " + onlyInject.getClass().getSimpleName());
        System.out.println("withDefault.class = " + withDefault.getClass().getSimpleName());
        System.out.println("withDefaultAndAny.class = " + withDefaultAndAny.getClass().getSimpleName());
        System.out.println("withQualifier.class = " + withQualifier.getClass().getSimpleName());
    }
}
