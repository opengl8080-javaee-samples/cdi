package sample.cdi.bean.producer;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

@Dependent
public class FugaFactory {
    @Produces
    private Fuga fuga = new Fuga("fuga factory");
}
