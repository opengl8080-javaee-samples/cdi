package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.qualifier.attribute.MyBeanType;
import sample.cdi.bean.qualifier.attribute.MyInterface;
import sample.cdi.bean.qualifier.attribute.MyQualifier;

@Stateless
public class QualifierAttributeEjb {
    @Inject @MyQualifier
    private MyInterface obj1;
    @Inject @MyQualifier(MyBeanType.FUGA)
    private MyInterface obj2;
    
    public void execute() {
        System.out.println("obj1.class = " + obj1.getClass().getSimpleName());
        System.out.println("obj2.class = " + obj2.getClass().getSimpleName());
    }
}
