import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;
    //Тесты
    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        String expectedGetSound = "Мяу"; // ожидаемый результат
        String actualGetSound = cat.getSound();
        assertEquals("Кошка мяукает", expectedGetSound, actualGetSound);
    }

    // Проверка метода
    @Test
    public void getFood() throws Exception {
        Cat cat = Mockito.spy(new Cat(feline));
        cat.getFood();
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }


}