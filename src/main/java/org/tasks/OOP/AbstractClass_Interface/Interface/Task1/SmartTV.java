package org.tasks.OOP.AbstractClass_Interface.Interface.Task1;

public class SmartTV implements RemoteControllable {
    private int volume = 20;

    @Override
    public void powerOn() {
        System.out.println("TV is turning on");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is turning off");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = Math.max(0, Math.min(volume, 100));
        System.out.println("TV volume set to " + this.volume);
    }
}
