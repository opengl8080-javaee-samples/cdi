package sample.cdi.bean.producer;

public class Fuga {
    
    private String name;
    
    public Fuga(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fuga{" + "name=" + name + ", hash=" + hashCode() + "}";
    }
}
