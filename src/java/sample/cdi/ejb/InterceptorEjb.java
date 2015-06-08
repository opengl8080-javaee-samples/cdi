package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.interceptor.Fuga;
import sample.cdi.bean.interceptor.Hoge;

@Stateless
public class InterceptorEjb {
    @Inject
    private Hoge hoge;
    @Inject
    private Fuga fuga;
    
    public void execute() {
        this.hoge.method();
    }
    
    public void optional() {
        this.fuga.method1();
        this.fuga.method2();
    }
}
