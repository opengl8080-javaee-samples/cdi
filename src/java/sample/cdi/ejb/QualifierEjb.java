package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.qualifier.FugaFuga;
import sample.cdi.bean.qualifier.HogeHoge;
import sample.cdi.bean.qualifier.MyInterface;

@Stateless
public class QualifierEjb {
    @Inject @HogeHoge
    private MyInterface hoge;
    
    private MyInterface fuga;
    
    @Inject
    public void setFuga(@FugaFuga MyInterface fuga) {
        this.fuga = fuga;
    }
    
    public void execute() {
        System.out.println("hoge=" + hoge);
        System.out.println("fuga=" + fuga);
    }
    
}
