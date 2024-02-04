import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    //Тесты
    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedGetFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualGetFood = feline.eatMeat();
        assertEquals("Список еды не соответствует Кошачьим = Хищники", expectedGetFood, actualGetFood);
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String expectedGetFamily = "Кошачьи";
        String actualGetFamily = feline.getFamily();
        assertEquals("Семейство Кошачьи", expectedGetFamily, actualGetFamily);
    }
}
