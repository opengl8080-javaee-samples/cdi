package sample.cdi.bean.producer;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

@Stateless
public class PiyoFactory {
    
    @Produces @RequestScoped
    public Piyo getPiyo() {
        return new Piyo();
    }
    
    public void disposerMethod(@Disposes Piyo piyo) {
        System.out.println("PiyoFactory#disposerMethod()");
        System.out.println("piyo = " + piyo);
        System.out.println("piyo.class = " + piyo.getClass());
    }
}
