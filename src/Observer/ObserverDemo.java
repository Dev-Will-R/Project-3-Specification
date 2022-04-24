package Observer;

import java.util.Random;

public class ObserverDemo {
    public static void main(String[] args){
        Subject subject = new Subject();
        Random rand = new Random();
        int upperbound = 50;

        new BiObserver(subject);
        new OctObserver(subject);
        new HexObserver(subject);

        int r1 = rand.nextInt(upperbound);
        System.out.println("State change: " + r1);
        subject.setStateValue(r1);
        System.out.println("");

        int r2 = rand.nextInt(upperbound);
        System.out.println("State change: " + r2);
        subject.setStateValue(r2);
    }
}
