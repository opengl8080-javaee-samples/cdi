package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import sample.cdi.bean.scope.RequestScopedBean;
import sample.cdi.bean.scope.SessionScopedBean;

@Stateless
public class LifeCycleCallbackMethodEjb {
    @Inject private HttpSession session;
    @Inject private SessionScopedBean ssb;
    @Inject private RequestScopedBean rsb;
    
    public void execute() {
        ssb.toString();
        rsb.toString();
        System.out.println("LifeCycleCallbackMethodEjb#execute()");
    }
    
    public void endSession() {
        System.out.println("LifeCycleCallbackMethodEjb#endSession()");
        this.session.invalidate();
    }
}
