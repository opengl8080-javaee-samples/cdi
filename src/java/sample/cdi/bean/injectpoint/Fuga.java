package sample.cdi.bean.injectpoint;

import javax.enterprise.context.Dependent;

@Dependent
public class Fuga {

    @Override
    public String toString() {
        return "Fuga{" + this.hashCode() + "}";
    }
}
