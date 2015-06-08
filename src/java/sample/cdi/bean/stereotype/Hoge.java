package sample.cdi.bean.stereotype;

@MyStereotype
public class Hoge {
    
    public void method() {
        System.out.println("Hoge.hash = " + hashCode());
    }
}
