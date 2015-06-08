package sample.cdi.bean.qualifier;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApplicationScopedBean {

    @Override
    public String toString() {
        return "ApplicationScopedBean{" + hashCode() + '}';
    }
}
