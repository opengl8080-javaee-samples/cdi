package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import sample.cdi.bean.qualifier.builtin.named.MyInterface;

@Stateless
public class NamedEjb {
    @Inject @Named("HOGE")
    private MyInterface hoge;
    @Inject @Named("fuga")
    private MyInterface fuga;
    
    public void execute() {
        System.out.println("hoge.class = " + hoge.getClass());
        System.out.println("fuga.class = " + fuga.getClass());
    }
}
