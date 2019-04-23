package help;

import candy.Candy;
import candy.Chocolate;
import candy.Jelly;
import candy.Lolipop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class RandomCandyTest {
    List<Candy> candies;
    RandomCandy rndCandy = new RandomCandy();

    @Before
    public void setUp() {
        candies = new ArrayList<Candy>(10);
        for (int i = 0; i < 10; i++) {
            candies.add(rndCandy.createRandomCandy());
        }
    }

    @Test
    public void createRandomCandy() {
        Candy candy = candies.get(0);
        boolean expected = true;
        boolean actual = false;
        if (candy instanceof Lolipop ||
            candy instanceof Chocolate ||
            candy instanceof Jelly) {
            actual = true;
        }

        assertEquals(expected, actual);
    }
}