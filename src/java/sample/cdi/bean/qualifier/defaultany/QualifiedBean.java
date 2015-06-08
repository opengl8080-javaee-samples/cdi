package sample.cdi.bean.qualifier.defaultany;

import javax.enterprise.context.Dependent;

@Dependent @MyQualifier
public class QualifiedBean implements MyInterface {

    @Override
    public String toString() {
        return "QualifiedBean{" + hashCode() + '}';
    }
}
