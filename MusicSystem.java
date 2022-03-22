package base;

public class MusicSystem implements Switch{

    @Override
    public void executeOn() {
        System.out.println("Music System is ON");
    }

    @Override
    public void executeOff() {
        System.out.println("Music System is OFF");
    }
}
