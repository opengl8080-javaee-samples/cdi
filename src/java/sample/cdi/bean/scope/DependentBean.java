package sample.cdi.bean.scope;

import java.io.Serializable;
import javax.enterprise.context.Dependent;

@Dependent
public class DependentBean implements Serializable {

    @Override
    public String toString() {
        return "{this=" + hashCode() + "}";
    }
}
