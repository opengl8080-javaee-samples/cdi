package sample.cdi.bean.producer;

import javax.annotation.PreDestroy;

public class Piyo {
    
    @PreDestroy
    public void preDestroy() {
        System.out.println("Piyo#preDestroy()");
    }

    @Override
    public String toString() {
        return "Piyo{" + hashCode() + "}";
    }
}
