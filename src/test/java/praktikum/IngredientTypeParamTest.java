package praktikum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class IngredientTypeParamTest {

    private final IngredientType expectedType;
    private final Ingredient ingredient;

    public IngredientTypeParamTest(IngredientType expectedType, Ingredient actualIngredient) {
        this.expectedType = expectedType;
        this.ingredient = actualIngredient;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {IngredientType.SAUCE, new Ingredient(IngredientType.SAUCE, "caramel", 50)},
                {IngredientType.FILLING, new Ingredient(IngredientType.FILLING, "tomato", 300)},
        };
    }

    @Test
    public void paramTestIngredientType() {

        Assert.assertEquals("Некорректный вид ингредиента",expectedType, ingredient.getType());

    }

}