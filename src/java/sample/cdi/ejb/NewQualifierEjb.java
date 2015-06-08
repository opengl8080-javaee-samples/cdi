package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.qualifier.RequestScopedBean;

@Stateless
public class NewQualifierEjb {
    @Inject
    private RequestScopedBean bean;
    
    public void execute() {
        System.out.println(bean);
    }
}
