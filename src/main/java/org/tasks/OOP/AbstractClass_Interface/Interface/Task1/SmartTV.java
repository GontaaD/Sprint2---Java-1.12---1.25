package org.tasks.OOP.AbstractClass_Interface.Interface.Task1;

public class SmartTV implements RemoteControllable {
    private int currentVolume = 0;

    @Override
    public void powerOn() {
        System.out.println("TV is turning on");
    }

    @Override
    public void setVolume(int volume) {
        int newVolume = Math.max(0, Math.min(volume, 100));
        if (newVolume == this.currentVolume) {
            return;
        }
        this.currentVolume = newVolume;
        System.out.println("TV volume set to: " + this.currentVolume);
    }

    @Override
    public void powerOff() {
        System.out.println("TV is turning off");
    }
}
