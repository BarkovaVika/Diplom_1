
package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BunTest {
    private final String nameBun = "NewBun";
    private final float priceBun = 50.0001F;
    private Bun bun;

    @Before
    public void createNewBun() {
        bun = new Bun(nameBun, priceBun);
    }

    @Test
    public void getNameBun() {
        String actualNameBun = bun.getName();

        Assert.assertEquals(nameBun, actualNameBun);
    }

    @Test
    public void getPriceBun() {
        float actualPriceBun = bun.getPrice();

        Assert.assertEquals(priceBun, actualPriceBun, 0);

    }
}
