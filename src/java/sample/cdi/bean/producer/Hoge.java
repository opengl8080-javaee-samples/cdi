package sample.cdi.bean.producer;

public class Hoge {
    
    private String name;
    
    public Hoge() {}
    
    public Hoge(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hoge{" + "name=" + name + ", hash=" + hashCode() + "}";
    }
}
