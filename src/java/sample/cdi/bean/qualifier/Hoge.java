package sample.cdi.bean.qualifier;

import javax.enterprise.context.Dependent;

@Dependent @HogeHoge
public class Hoge implements MyInterface {

    @Override
    public String toString() {
        return "Hoge{" + hashCode() + '}';
    }
}
