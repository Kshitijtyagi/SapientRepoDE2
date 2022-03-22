package base;

public class Bulb implements Switch
{

    @Override
    public void executeOn() {
        System.out.println("Bulb is ON");
    }

    @Override
    public void executeOff() {
        System.out.println("Bulb is OFF");
    }
}