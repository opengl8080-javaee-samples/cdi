package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import sample.cdi.bean.event.MyEvent;

@Stateless
public class EventEjb {
    @Inject
    private Event<MyEvent> event;
    
    public void execute() {
        this.event.fire(new MyEvent("Hello CDI Event!!"));
    }
}
