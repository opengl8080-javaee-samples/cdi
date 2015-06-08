package sample.cdi.bean.producer;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

@Stateless
public class HogeFactory {
    
    @Produces @RequestScoped
    public Hoge getHoge() {
        System.out.println("getHoge()");
        return new Hoge("hoge factory");
    }
}
