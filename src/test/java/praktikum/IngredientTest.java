package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IngredientTest {
    private Ingredient ingredient;
    String expectedIngredientName = "caramel";
    private final float expectedIngredientPrice = 30.05F;


    @Before
    public void createNewIngredient() {
        ingredient = new Ingredient(IngredientType.SAUCE, expectedIngredientName, expectedIngredientPrice);
    }

    @Test
    public void getIngredientPrice() {
        float actualIngredientPrice = ingredient.getPrice();

        Assert.assertEquals(expectedIngredientPrice, actualIngredientPrice, 0);
        System.out.println(actualIngredientPrice);
    }

    @Test
    public void getIngredientName() {
        String actualIngredientName = ingredient.getName();

        Assert.assertEquals(expectedIngredientName, actualIngredientName);

    }

    @Test
    public void getIngredientType() {
        IngredientType expectedTypeSauce = IngredientType.SAUCE;
        IngredientType actualTypeSauce = ingredient.getType();

        Assert.assertEquals(expectedTypeSauce, actualTypeSauce);
    }
}
