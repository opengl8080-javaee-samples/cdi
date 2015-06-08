package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.alternative.beansxml.MyInterface;

@Stateless
public class AlternativeEjb {
    @Inject
    private MyInterface obj;
    
    public void execute() {
        System.out.println("obj.class = " + obj.getClass().getSimpleName());
    }
}
