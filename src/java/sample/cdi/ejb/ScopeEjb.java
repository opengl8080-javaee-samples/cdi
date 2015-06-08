package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.enterprise.context.Conversation;
import javax.inject.Inject;
import sample.cdi.bean.scope.ApplicationScopedBean;
import sample.cdi.bean.scope.ConversationScopedBean;
import sample.cdi.bean.scope.RequestScopedBean;
import sample.cdi.bean.scope.SessionScopedBean;

@Stateless
public class ScopeEjb {
    @Inject private ApplicationScopedBean asb;
    @Inject private SessionScopedBean ssb;
    @Inject private RequestScopedBean rsb;
    
    public void execute() {
        String msg =
            "application scoped : " + asb + "\n"
          + "session scoped : " + ssb + "\n"
          + "request scoped : " + rsb + "\n"
        ;
        
        System.out.println(msg);
    }
    
    public void proxy() {
        System.out.println("application scoped : " + this.asb.getClass());
        System.out.println("session scoped : " + this.ssb.getClass());
        System.out.println("request scoped : " + this.rsb.getClass());
    }
    
    @Inject
    private ConversationScopedBean csb;
    @Inject
    private Conversation conv;
    
    public void beginConversation() {
        this.conv.begin();
        System.out.println("begin conversation scope. cid = " + this.conv.getId());
        System.out.println("csb=" + this.csb);
    }
    
    public void conversation() {
        System.out.println("cid = " + this.conv.getId());
        System.out.println("csb=" + this.csb);
    }
    
    public void endConversation() {
        System.out.println("end conversation scope. cid = " + this.conv.getId());
        System.out.println("csb=" + this.csb);
        this.conv.end();
    }
}
