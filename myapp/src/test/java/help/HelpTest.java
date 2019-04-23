package help;

import candy.Candy;
import candy.Chocolate;
import candy.Jelly;
import candy.Lolipop;
import createGift.Gift;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;
import  static help.Help.*;

public class HelpTest {
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
    public void sortByPrice() {
        Collections.sort(candies, new Comparator<Candy>() {
            public int compare(Candy o1, Candy o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        Help.sortByPrice(gift);

        assertEquals(candies, gift.getCandies());
    }

    @Test
    public void deleteByName() {
        candies.remove(0);
        Help.deleteByName(gift,"A");
        assertEquals(candies,gift.getCandies());
    }

    @Test
    public void reverseByName() {
        Candy loli = new Lolipop("B", 10, 37, 2, 12, 1);
        Help.reverseByName(gift,"A",loli);
        candies.set(0,loli);
        assertEquals(candies,gift.getCandies());
    }

    @Test
    public void reverceByNameNull() {
        Candy loli = new Lolipop("B", 10, 37, 2, 12, 1);
        Help.reverseByName(gift,"A",null);
        candies.set(0,loli);
        assertNotEquals(candies,gift.getCandies());
    }

    @Test
    public void searchBySugarContent() {
        Help.searchBySugarContent(1,3,gift);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchBySugarContent_getIllegalArgumentException(){
        Help.searchBySugarContent(-2,-9,gift);
    }
}