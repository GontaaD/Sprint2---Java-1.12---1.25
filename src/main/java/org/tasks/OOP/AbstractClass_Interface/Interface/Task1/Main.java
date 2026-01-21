package org.tasks.OOP.AbstractClass_Interface.Interface.Task1;

public class Main {
    public static void main(String[] args){
        RemoteControllable tv = new SmartTV();
        RemoteControllable audio = new AudioSystem();
        operateDevice(tv);
        operateDevice(audio);
    }

    public static void operateDevice(RemoteControllable device) {
        device.powerOn();
        device.setVolume(60);
        device.powerOff();
    }
}
