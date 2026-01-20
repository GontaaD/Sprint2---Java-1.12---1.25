package org.tasks.OOP.Composition;

public class Car {

    public void carWork() {
        Engine engine = new Engine();
        System.out.println("Beep-beep");
        engine.engineWork();
    }
}
