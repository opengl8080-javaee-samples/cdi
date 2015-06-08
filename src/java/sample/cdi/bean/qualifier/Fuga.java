package sample.cdi.bean.qualifier;

import javax.enterprise.context.Dependent;

@Dependent @FugaFuga
public class Fuga implements MyInterface {

    @Override
    public String toString() {
        return "Fuga{" + hashCode() + '}';
    }
}
