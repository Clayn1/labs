package lab7;

import com.sun.source.tree.AssertTree;
import lab6.Coach;
import lab6.Train;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTrainSet extends Assert {
    private TrainSet trainSet;

    @Before
    public void before(){
        trainSet = new TrainSet();
    }

    @Test(expected = WrongComfortExeption.class)
    public void testComfortAdd() throws WrongComfortExeption{
        trainSet.add(new Train(10,10,""));
    }
    @Test(expected = WrongLuggageExeption.class)
    public void testLuggageAdd() throws WrongComfortExeption{
        trainSet.add(new Train(10,-5,"QW"));
    }
    @Test(expected = WrongUsedSeatsExeption.class)
    public void testUsedSeatsAdd() throws WrongComfortExeption{
        trainSet.add(new Train(-10,10,"QW"));
    }
    @Test
    public void testAdd(){
        Train train = new Coach();
        assertTrue(trainSet.add(train));
    }
}