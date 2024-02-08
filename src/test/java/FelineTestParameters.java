import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class FelineTestParameters {
    private final int kittensCount;

    public FelineTestParameters(int kittensCount) {
        this.kittensCount = kittensCount;
    }
    //Параметр.тест
    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][]{
                {0},
                {4},
        };
    }

    @Test
    public void getKittensParamKitten() {
        Feline feline = new Feline();
        int actualGetKittens = feline.getKittens(kittensCount);
        Assert.assertEquals(kittensCount, actualGetKittens);
    }
}