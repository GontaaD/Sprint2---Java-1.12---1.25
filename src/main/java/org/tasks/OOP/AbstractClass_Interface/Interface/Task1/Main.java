package org.tasks.OOP.AbstractClass_Interface.Interface.Task1;

public class Main {
    public static void main(String[] args){

        RemoteControllable myTv = new SmartTV();
        RemoteControllable myAudioSystem = new AudioSystem();

        System.out.println("Testing TV:");
        operateDevice(myTv);

        System.out.println("\nTesting AudioSystem:");
        operateDevice(myAudioSystem);
    }

    public static void operateDevice(RemoteControllable device) {
        device.powerOn();
        device.setVolume(30);
        device.setVolume(60);
        device.setVolume(110);
        device.setVolume(0);
        device.setVolume(-10);
        device.powerOff();
    }
}
