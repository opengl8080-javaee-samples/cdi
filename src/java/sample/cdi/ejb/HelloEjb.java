package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.HelloBean;

@Stateless
public class HelloEjb {
    @Inject
    private HelloBean helloBean;
    
    public void execute() {
        this.helloBean.method();
    }
}
