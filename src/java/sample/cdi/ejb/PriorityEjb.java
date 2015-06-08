package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.alternative.priority.MyInterface;

@Stateless
public class PriorityEjb {
    @Inject
    private MyInterface obj;
    
    public void execute() {
        System.out.println("obj.class = " + obj.getClass().getSimpleName());
    }
}
