import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    //Тесты
    @Test
    public void getKittensLion() throws Exception {
        Lion lion = new Lion("Самец");
        int expectedGetKittens = 1;
        int actualGetKittens = lion.getKittens();
        assertEquals("У льва не может быть котят", expectedGetKittens, actualGetKittens);
    }

    @Test
    public void doesHaveManeLion() throws Exception {
        Lion lion = new Lion("Самец");
        boolean expectedHasMane = true;
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals("У льва есть грива", expectedHasMane, actualHasMane);
    }

    @Test
    public void getFoodLion() throws Exception {
        Lion lion = new Lion("Самец");
        List<String> expectedGetFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualGetFood = lion.getFood();
        assertEquals("Список еды не соответствует Львиному = Хищнику", expectedGetFood, actualGetFood);
    }
}
