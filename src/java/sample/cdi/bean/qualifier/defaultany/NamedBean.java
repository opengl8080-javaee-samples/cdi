package sample.cdi.bean.qualifier.defaultany;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

//@Dependent @Named
public class NamedBean implements MyInterface {

    @Override
    public String toString() {
        return "NamedBean{" + hashCode() + '}';
    }
}
