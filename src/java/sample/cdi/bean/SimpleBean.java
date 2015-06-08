package sample.cdi.bean;

import javax.enterprise.context.Dependent;

@Dependent
public class SimpleBean {
    
    private SimpleBean(String s) {
    }
}
