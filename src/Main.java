import exampleStruct.SomeBean;
import myStruct.Warrior;
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


        injector.setFileName("files/myProperies/lightEquipmentKit.properties");
        Warrior warrior = injector.inject(new Warrior());
        System.out.println(warrior.Fight());

        injector.setFileName("files/myProperies/heavyEquipmentKit.properties");
        warrior = injector.inject(new Warrior());
        System.out.println(warrior.Fight());

    }
}