package sample.cdi.bean.qualifier.builtin.named;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Dependent @Named("HOGE")
public class Hoge implements MyInterface {
}
