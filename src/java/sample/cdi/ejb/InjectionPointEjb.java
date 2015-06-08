package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.injectpoint.Hoge;

@Stateless
public class InjectionPointEjb {
    
    @Inject
    private Hoge hoge;
    
    public void execute() {
        System.out.println(hoge);
    }
}
