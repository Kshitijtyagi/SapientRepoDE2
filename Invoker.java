package base;

public class Invoker
{
    private Switch sw;

    Invoker(Switch sw){
        this.sw=sw;
    }

    void turnOn(){
        sw.executeOn();
    }

    void turnOff(){
       sw.executeOff();
    }


}
