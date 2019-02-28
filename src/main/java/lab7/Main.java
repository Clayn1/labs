package lab7;

import java.util.Arrays;
import java.util.Iterator;
import lab6.*;

public class Main {
    public static void main(String[] args) {
        CoachSet coachSet = new CoachSet();
        System.out.println(coachSet.isEmpty());
        System.out.println("-------------------------------");

        AbstractCoach obj1 = new AbstractCoach(10,70,"Huge comfort");
        AbstractCoach obj2 = new AbstractCoach(20,60,"Very NICE!");
        AbstractCoach obj3 = new AbstractCoach(30,50,"~Aaah");
        AbstractCoach obj4 = new AbstractCoach(40,40,"Nice!");
        AbstractCoach obj5 = new AbstractCoach(50,30,"Fine");
        AbstractCoach obj6 = new AbstractCoach(60,20,"Meh");
        AbstractCoach obj7 = new AbstractCoach(70,10,"Ew");

        coachSet.add(obj1);
        coachSet.add(obj2);
        coachSet.add(obj3);
        coachSet.add(obj4);
        coachSet.add(obj5);
        coachSet.add(obj6);
        coachSet.add(obj7);

        System.out.println("Содержит ли объект 1: "+ coachSet.contains(obj1));
        System.out.println("Содержит ли объект, которого изначально не было: "+ coachSet.contains(new AbstractCoach(11,12,"Perevirka")));
        System.out.println("-------------------------------");

        CoachSet firstCoachSet = new CoachSet();
        CoachSet secondCoachSet = new CoachSet();
        CoachSet thirdCoachSet = new CoachSet();

        firstCoachSet.add(obj1);
        firstCoachSet.add(obj2);
        firstCoachSet.add(obj3);
        firstCoachSet.add(obj4);
        firstCoachSet.add(obj5);

        secondCoachSet.add(obj1);
        secondCoachSet.add(obj2);
        secondCoachSet.add(obj4);
        secondCoachSet.add(obj6);
        secondCoachSet.add(obj7);

        thirdCoachSet.add(obj1);
        thirdCoachSet.add(obj2);
        thirdCoachSet.add(obj3);
        thirdCoachSet.add(obj5);
        thirdCoachSet.add(obj6);

//        firstCoachSet.removeAll(secondCoachSet);
        System.out.print(Arrays.toString(firstCoachSet.toArray())+"\n");
        System.out.println("-------------------------------");
        System.out.print(Arrays.toString(thirdCoachSet.toArray())+"\n");
        System.out.println("-------------------------------");

        System.out.println("Содержит ли изначальная коллекция все элементы меньшей коллекции: "+ coachSet.containsAll(secondCoachSet));
        System.out.println("-------------------------------");

        AbstractCoach[] A = new AbstractCoach[7];
        A[0]=obj7;A[1]=obj6;A[2]=obj5;A[3]=obj4;A[4]=obj3;A[5]=obj2;A[6]=obj1;
        firstCoachSet.toArray(A);
        System.out.println(Arrays.toString(A)+"\n");

        System.out.println("-------------------------------");

        secondCoachSet.remove(obj1);
        secondCoachSet.remove(obj2);
        System.out.println(Arrays.toString(secondCoachSet.toArray())+"\n");
        System.out.println("-------------------------------");
        secondCoachSet.addAll(firstCoachSet);
        System.out.println(Arrays.toString(secondCoachSet.toArray())+"\n");
        System.out.println("-------------------------------");
        secondCoachSet.clear();
        System.out.println("["+Arrays.toString(secondCoachSet.toArray())+"]");
        System.out.println("-------------------------------");

        Iterator<AbstractCoach> trainIterator = coachSet.iterator();
        System.out.println(trainIterator.hasNext());
        System.out.println(trainIterator.next());
    }
}
