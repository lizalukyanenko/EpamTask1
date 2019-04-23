package candy;

import org.junit.Test;

public class ChocolateTest {

    @Test
    public void candyConstructor_fail_getIlegalArgumentException() throws IllegalAccessException{
        Candy candy = new Chocolate("Chocolate", 2, 3, 1, 4, 1);
    }
}