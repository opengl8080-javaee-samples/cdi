package sample.cdi.bean.scope;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ApplicationScopedBean {
    @Inject
    private SessionScopedBean sessionBean;
    @Inject
    private DependentBean dependentBean;
    
    @Override
    public String toString() {
        return "{this=" + hashCode() + ", sessionBean=" + sessionBean + ", dependentBean=" + dependentBean + "}";
    }
}
