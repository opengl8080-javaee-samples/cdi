package sample.cdi.bean.event;

import javax.enterprise.context.Dependent;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.EventMetadata;

@Dependent
public class MyObserver {
    
    public void notifyMyEvent(@Observes MyEvent event, EventMetadata metadata) {
        System.out.println("event = " + event);
        System.out.println(metadata.getInjectionPoint().getMember());
    }
}
