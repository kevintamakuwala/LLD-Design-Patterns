import components.*;
import gamestation.PS5;
public class FacadeRunner {
    public static void main(String[] args) {
        System.out.println("=====Facade Pattern=====");
        Screen screen = new Screen();
        Lights lights = new Lights();
        Speakers speakers = new Speakers();
        PS5 ps5 = new PS5(lights, screen, speakers);
        ps5.powerOnPS5();
        ps5.powerOffPS5();
    }
}
