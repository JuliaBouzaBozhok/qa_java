import com.example.LionAlex;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LionAlexTest {
    @Test
    public void checkAlexTest() throws Exception {
        assertTrue(new LionAlex().doesHaveMane());
    }

    @Test
    public void checkGetKittens() throws Exception {
        LionAlex lionAlex = new LionAlex();
        assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void checkGetFriends() throws Exception {
        assertEquals(List.of("зёбра Мартин", "бегемот Глория", "жираф Мелман"), new LionAlex().getFriends());
    }

    @Test
    public void checkPlaceOfLiving() throws Exception {
        assertEquals("Нью-Йоркский зоопарк", new LionAlex().getPlaceOfLiving());
    }

}
