package org.tasks.OOP.AbstractClass_Interface.Interface.Task1;

public class AudioSystem implements RemoteControllable {
    private int newVolume;
    private int currentVolume;

    @Override
    public void powerOn() {
        System.out.println("Audio system is turning on");
    }

    @Override
    public void setVolume(int volume) {
        newVolume = Math.max(0, Math.min(volume, 100));

        if (newVolume == this.currentVolume) {
            return;
        }
        System.out.println("Volume level set to: " + newVolume);

        if (newVolume > 50 && currentVolume <= 50) {
            System.out.println("Bass boost activated");
        } else if (currentVolume > 50 && newVolume <= 50) {
            System.out.println("Bass boost deactivated");
        }
        this.currentVolume = newVolume;
    }

    @Override
    public void powerOff() {
        System.out.println("Audio system is turning off");
    }
}
