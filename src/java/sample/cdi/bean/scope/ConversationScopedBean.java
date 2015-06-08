package sample.cdi.bean.scope;

import java.io.Serializable;
import javax.enterprise.context.ConversationScoped;

@ConversationScoped
public class ConversationScopedBean implements Serializable {

    @Override
    public String toString() {
        return "{this=" + hashCode() + "}";
    }
}
