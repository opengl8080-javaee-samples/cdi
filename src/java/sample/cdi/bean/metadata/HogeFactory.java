package sample.cdi.bean.metadata;

import java.lang.reflect.Member;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

@Dependent
public class HogeFactory {
    
    @Produces
    public Hoge getHoge(InjectionPoint ip) {
        System.out.println("getHoge()");
        
        Member member = ip.getMember();
        System.out.println("member = " + member);
        System.out.println("member.class = " + member.getClass());
        
        return new Hoge();
    }
}
