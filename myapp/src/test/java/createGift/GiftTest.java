package createGift;

import candy.Candy;
import candy.Chocolate;
import candy.Jelly;
import candy.Lolipop;
import help.RandomCandy;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GiftTest {
    Gift gift;
    List<Candy> candies;
    Candy ch,lol,jel;

    @Before
    public void setUp() throws Exception {
        gift = new Gift();
        candies = new ArrayList<Candy>();
        ch = new Chocolate("A", 10, 37, 2, 12, 1);
        lol = new Lolipop("B", 10, 37, 2, 12, 1);
        jel = new Jelly("C", 10, 2, 2, 12, 1);
        gift.add(ch);
        gift.add(lol);
        gift.add(jel);
        candies.add(ch);
        candies.add(lol);
        candies.add(jel);
    }

    @Test
    public void priceGift() {
        double expected = 10+10+10;
        double actual = gift.priceGift();

        assertEquals(expected, actual,0.000001);
    }

    @Test
    public void weightGift() {
        double expected = 37+37+2;
        double actual = gift.weightGift();

        assertEquals(expected, actual,0.000001);
    }

    @Test
    public void countOfGift() {
        int expected = 1+1+1;
        int actual = gift.countOfGift();

        assertEquals(expected, actual);
    }

    @Test
    public void volumeGift() {
        double expected = 12+12+12;
        double actual = gift.volumeGift();

        assertEquals(expected, actual,0.000001);
    }

    @Test
    public void addPassed() {
        Candy type1 = new Chocolate("A", 10, 7, 2, 12, 1);
        candies.add(type1);
        gift.add(type1);
        assertEquals(candies, gift.getCandies());
    }

    @Test
    public void addNotPassed() {
        Candy type1 = new Chocolate("A", 10, 107, 2, 12, 1);
        candies.add(type1);
        gift.add(type1);
        assertNotEquals(candies, gift.getCandies());
    }

    @Test
    public void getSize() {
        int expected = candies.size();
        int actual = gift.getSize();

        assertEquals(expected, actual);
    }

    @Test
    public void getObject() {
        Candy expected = ch;
        Candy actual = gift.getObject(0);

        assertEquals(expected, actual);
    }

    @Test
    public void getCandies() {
        assertEquals(candies, gift.getCandies());
    }

    @Test
    public void addNull() {
        Candy type1 = new Chocolate("A", 10, 7, 2, 12, 1);
        candies.add(type1);
        gift.add(null);
        assertNotEquals(candies, gift.getCandies());
    }

    @Test
    public void toStringPassed() {
        String expected = "Gift\n{" +
                "price: " + gift.priceGift() +
                ", weight: " + gift.weightGift() +
                ", volume: " + gift.volumeGift() +
                ", count candies in the gift: " + gift.countOfGift() +
                "}"+candies.toString();
        String actual = gift.toString();

        assertEquals(expected, actual);
    }
}