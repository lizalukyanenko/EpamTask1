package candy;

import org.junit.Test;

public class LolipopTest {

    @Test
    public void candyConstructor_fail_getIlegalArgumentException() throws IllegalAccessException{
        Candy candy = new Lolipop("Lolipop", 2, 3, 1, 4, 1);
    }
}