package org.tasks.OOP.AbstractClass_Interface.Interface.Task1;

public class AudioSystem implements RemoteControllable {
    private int volume = 10;

    @Override
    public void powerOn() {
        System.out.println("Audio system powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("Audio system shutting down");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = Math.max(0, Math.min(volume, 100));
        System.out.println("Audio system volume set to " + this.volume);

        if (this.volume > 50) {
            System.out.println("Bass Boost activated!");
        }
    }
}
