package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.stereotype.Hoge;

@Stateless
public class StereotypeEjb {
    @Inject
    private Hoge hoge;
    
    public void execute() {
        this.hoge.method();
    }
}
