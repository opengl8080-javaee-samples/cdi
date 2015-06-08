package sample.cdi.bean.scope;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

@SessionScoped
public class SessionScopedBean implements Serializable {
    @Inject
    private RequestScopedBean requestBean;
    @Inject
    private DependentBean dependentBean;
    
    @Override
    public String toString() {
        return "{this=" + hashCode() + ", requestBean=" + requestBean + ", dependentBean=" + dependentBean + "}";
    }
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("[Session Scope] post construct : " + hashCode());
    }
    
    @PreDestroy
    public void preDestroy() {
        System.out.println("[Session Scope] pre destroy : " + hashCode());
    }
}
