package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Instance;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;
import sample.cdi.bean.instance.MyInterface;
import sample.cdi.bean.instance.MyQualifier;

@Stateless
public class InstanceEjb {
    
    @Any
    @Inject
    private Instance<MyInterface> instance;
    
    public void execute() {
        System.out.println("ambiguous = " + instance.isAmbiguous());
        
        Instance<MyInterface> defaults = instance.select(new AnnotationLiteral<Default>() {});
        System.out.println("defaults.class = " + defaults.get().getClass());
        
        Instance<MyInterface> qualified = instance.select(new AnnotationLiteral<MyQualifier>() {});
        System.out.println("qualified.class = " + qualified.get().getClass());
    }
}
