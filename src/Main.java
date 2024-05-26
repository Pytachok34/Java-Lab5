import exampleStruct.SomeBean;
import task.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = new Injector();
        injector.setFileName("files/exampleProperties/first.properties");
        SomeBean sb = injector.inject(new SomeBean());
        sb.foo();

        injector.setFileName("files/exampleProperties/second.properties");
        sb = injector.inject(new SomeBean());
        sb.foo();
    }
}