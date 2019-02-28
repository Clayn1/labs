package lab7;

import lab6.Coach;
import lab6.AbstractCoach;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAbstractCoachSet extends Assert {
    private CoachSet coachSet;

    @Before
    public void before(){
        coachSet = new CoachSet();
    }

    @Test/*(expected = WrongComfortException.class)*/
    public void testComfortAdd() {
        coachSet.add(new AbstractCoach(10,10,null));
    }
    @Test(expected = WrongLuggageExeption.class)
    public void testLuggageAdd() throws WrongComfortException {
        coachSet.add(new AbstractCoach(10,-5,"QW"));
    }
    @Test(expected = WrongUsedSeatsExeption.class)
    public void testUsedSeatsAdd() throws WrongComfortException {
        coachSet.add(new AbstractCoach(-10,10,"QW"));
    }
    @Test
    public void testAdd(){
        AbstractCoach abstractCoach = new Coach();
        assertTrue(coachSet.add(abstractCoach));
    }
}