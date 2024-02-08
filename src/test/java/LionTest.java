import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Test
    public void getKittensLion() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        int expectedGetKittens = 1;
        int actualGetKittens = lion.getKittens();
        assertEquals("У льва не может быть котят", expectedGetKittens, actualGetKittens);
    }

    @Test
    public void doesHaveManeLion() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        boolean expectedHasMane = true;
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals("У льва есть грива", expectedHasMane, actualHasMane);
    }

    @Test
    public void getFoodLion() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        List<String> expectedGetFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualGetFood = lion.getFood();
        assertEquals("Список еды не соответствует Львиному = Хищнику", expectedGetFood, actualGetFood);
    }

    @Test
    public void checkHasManeException() throws Exception {
        assertThrows(Exception.class, () -> {
            new Lion("Трансгендер", new Feline());
        });
    }

    @Test
    public void lionGetKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        Lion lionSpy = Mockito.spy(lion);
        lionSpy.getKittens();
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lionSpy.getKittens());
    }

    @Test
    public void checkGetFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        Lion lionSpy = Mockito.spy(lion);
        lionSpy.getFood();
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lionSpy.getFood());
    }

}