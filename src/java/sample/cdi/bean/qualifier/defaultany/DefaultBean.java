package sample.cdi.bean.qualifier.defaultany;

import javax.enterprise.context.Dependent;

@Dependent
public class DefaultBean implements MyInterface {

    @Override
    public String toString() {
        return "DefaultBean{" + hashCode() + '}';
    }
}
