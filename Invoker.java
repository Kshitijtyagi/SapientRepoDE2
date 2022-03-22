package base;

public class Invoker
{
    private Switch sw;

    Invoker(Switch sw){
        //this.sw=sw;
		//commented the lines for created a Bug
    }

    void turnOn(){
        sw.executeOn();
    }

    void turnOff(){
       sw.executeOff();
    }


}
