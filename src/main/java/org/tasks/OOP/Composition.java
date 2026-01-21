package org.tasks.OOP;

public class Composition {
    class Engine {
        void start() {
            System.out.println("Engine started");
        }
    }

    class Car {
        private Engine engine;

        Car() {
            this.engine = new Engine();
        }

        void startCar() {
            engine.start();
            System.out.println("Car is running");
        }
    }

}
