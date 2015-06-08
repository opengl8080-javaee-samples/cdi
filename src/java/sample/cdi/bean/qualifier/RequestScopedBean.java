package sample.cdi.bean.qualifier;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.New;
import javax.inject.Inject;

@RequestScoped
public class RequestScopedBean {
    @Inject
    private ApplicationScopedBean normalBean;
    @Inject @New
    private ApplicationScopedBean newBean;
    
    @Override
    public String toString() {
        return "RequestScopedBean{" + hashCode() + ", normalBean=" + normalBean + ", newBean=" + newBean + '}';
    }
}
