package sample.cdi.bean.event;

public class MyEvent {
    private String name;

    public MyEvent(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyEvent{" + "name=" + name + '}';
    }
}
