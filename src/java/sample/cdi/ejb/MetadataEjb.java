package sample.cdi.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import sample.cdi.bean.metadata.Hoge;

@Stateless
public class MetadataEjb {
    @Inject
    private Hoge hoge;
    
    public void execute() {
    }
}
