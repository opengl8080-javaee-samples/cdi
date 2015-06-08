package sample.cdi.bean.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class RequestScopedBean {

    @Inject
    private DependentBean dependentBean;
    
    @Override
    public String toString() {
        return "{this=" + hashCode() + ", dependentBean=" + dependentBean + "}";
    }
    
    @PostConstruct
    public void postConstruct() {
        System.out.println("[Request Scope] post construct : " + hashCode());
    }
    
    @PreDestroy
    public void preDestroy() {
        System.out.println("[Request Scope] pre destroy : " + hashCode());
    }
}
