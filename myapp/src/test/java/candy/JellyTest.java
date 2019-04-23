package candy;

import org.junit.Test;

public class JellyTest {

    @Test
    public void candyConstructor_fail_getIlegalArgumentException() throws IllegalAccessException{
        Candy candy = new Jelly("Jelly", 2, 3, 1, 4, 1);
    }
}