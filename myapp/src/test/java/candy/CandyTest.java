package candy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyTest {
    Candy candy;

    @Before
    public void setUp() throws Exception {
        candy = new Lolipop("Lolipop",2,3,1,4,1);
    }

    @Test
    public void toStringPassed() {
        String name = "Lolipop";
        double price = 2;
        double weight = 3;
        double sugarContent = 1;
        double v = 4;              //объем
        int count = 1;
        candy = new Lolipop(name,price,weight,sugarContent,v,count);

        String expected = "\nCandy\n{" +
                "name: " + name +
                ", price: " + price +
                ", weight: " + weight +
                ", sugarContent: " + sugarContent +
                ", volume: " + v +
                ", count: " + count +
                "}";
        String actual = candy.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        String expected = "Lolipop";
        String actual = candy.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void getPrice() {
        double expected = 2;
        double actual = candy.getPrice();

        assertEquals(expected, actual, 0.0000001);
    }

    @Test
    public void getWeight() {
        double expected = 3;
        double actual = candy.getWeight();

        assertEquals(expected, actual, 0.0000001);
    }

    @Test
    public void getSugarContent() {
        double expected = 1;
        double actual = candy.getSugarContent();

        assertEquals(expected, actual, 0.0000001);
    }

    @Test
    public void getV() {
        double expected = 4;
        double actual = candy.getV();

        assertEquals(expected, actual, 0.0000001);
    }

    @Test
    public void getCount() {
        int expected = 1;
        int actual = candy.getCount();

        assertEquals(expected, actual);
    }
}