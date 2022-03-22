package base;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Invoker SimpleRemoteControl;
        Scanner input=null;
        Bulb b=new Bulb();
        MusicSystem ms=new MusicSystem();
        try {
            System.out.println("Welcome to Simple Remote Control Centre:::::\n Select Which Appliance and Activity");
            System.out.println("1. Turn Bulb on\n2. Turn Bulb off\n3. Turn Music System on\n4. Turn Music System off");
            System.out.print("Enter your Choice : ");
            input = new Scanner(System.in);
            int choice = input.nextInt();
            switch(choice){

                case 1 :
                    SimpleRemoteControl=new Invoker(b);
                    SimpleRemoteControl.turnOn();
                    break;
                case 2 :
                    SimpleRemoteControl=new Invoker(b);
                    SimpleRemoteControl.turnOff();
                    break;
                case 3 :
                    SimpleRemoteControl=new Invoker(ms);
                    SimpleRemoteControl.turnOn();
                    break;
                case 4 :
                    SimpleRemoteControl=new Invoker(ms);
                    SimpleRemoteControl.turnOff();
                    break;
                default :
                    System.out.println("Invalid Choice. Exiting the Simple Remote Control Centre!");
                    break;
            }

        }
        catch(Exception e){
            System.out.println("Invalid Choice. Exiting the Simple Remote Control Centre!");
        }
        finally {
            System.out.println("Exit from the Simple Remote Control Centre Complete!");
            if(input==null)
                try {
                    input.close();
                }catch(Exception e){
                    e.printStackTrace();
                }

        }
    }
}
