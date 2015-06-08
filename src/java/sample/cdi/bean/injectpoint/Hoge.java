package sample.cdi.bean.injectpoint;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
public class Hoge {
    @Inject
    private Fuga fieldInjection;
    private Fuga initializerMethodInjection;
    private Fuga constructorInjection;
    
    @Inject
    public Hoge(Fuga fuga) {
        System.out.println("constructor injection!!");
        this.constructorInjection = fuga;
    }
    
    @Inject
    public void setFuga(Fuga fuga) {
        System.out.println("initializer method injection!!");
        this.initializerMethodInjection = fuga;
    }

    @Override
    public String toString() {
        return "Hoge{" + "fieldInjection=" + fieldInjection + ", initializerMethodInjection=" + initializerMethodInjection + ", constructorInjection=" + constructorInjection + '}';
    }
}
