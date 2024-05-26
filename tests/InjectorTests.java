import myStruct.Warrior;
import task.Injector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class InjectorTests {

    @org.junit.jupiter.api.Test
    void setFileNameTest() {
        Injector injector = new Injector();

        Exception ex = assertThrows(RuntimeException.class, ()->{
            injector.inject(new Warrior());
        });

        assertEquals("File path must be set", ex.getMessage());
    }

    @org.junit.jupiter.api.Test
    void injectTest() {

        Exception ex = assertThrows(NullPointerException.class, ()->{
            (new Warrior()).Fight();
        });

        Injector injector = new Injector();
        injector.setFileName("files/myProperies/lightEquipmentKit.properties");
        Warrior warrior = injector.inject(new Warrior());

        assertEquals("Bang\nLow level protection", warrior.Fight());
    }

    @org.junit.jupiter.api.Test
    void injectAnotherTest() {
        Injector injector = new Injector();
        injector.setFileName("files/myProperies/heavyEquipmentKit.properties");
        Warrior warrior = injector.inject(new Warrior());

        assertEquals("Bang-bang-bang\nHigh level protection", warrior.Fight());
    }
}
