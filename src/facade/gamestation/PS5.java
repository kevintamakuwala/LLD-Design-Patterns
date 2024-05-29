package gamestation;

import components.*;

public class PS5 {
    private Lights lights;
    private Screen screen;
    private Speakers speakers;

    public PS5(Lights lights, Screen screen, Speakers speakers) {
        this.lights = lights;
        this.screen = screen;
        this.speakers = speakers;
    }

    public void powerOnPS5() {
        lights.turnOn();
        screen.turnOn();
        speakers.increaseVolume();
        System.out.println("Play Station 5 powered On!\n\n");
    }

    public void powerOffPS5() {
        lights.turnOff();
        screen.turnOff();
        speakers.decreaseVolume();
        System.out.println("Play Station 5 powered Off!");
    }
}
