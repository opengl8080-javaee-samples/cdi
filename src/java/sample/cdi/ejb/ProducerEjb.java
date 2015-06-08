package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.producer.Fuga;
import sample.cdi.bean.producer.Hoge;
import sample.cdi.bean.producer.Piyo;

@Stateless
public class ProducerEjb {
    @Inject
    private Hoge hoge;
    
    public void execute() {
        System.out.println(hoge);
        System.out.println(hoge.getClass());
    }
    
    @Inject
    private Fuga fuga;
    
    public void field() {
        System.out.println(fuga);
        System.out.println(fuga.getClass());
    }
    
    @Inject
    private Piyo piyo;
    
    public void disposer() {
        System.out.println("ProducerEjb#disposer()");
        System.out.println("piyo = " + piyo);
        System.out.println("piyo.class = " + piyo.getClass());
    }
}
