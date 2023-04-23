import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    public SumCalculator calc;

    @BeforeEach
    public void beforeEach(){
       calc = new SumCalculator();
     }

    @Test
    public void testThatSumWorksCorrect1() {
        //When
        int actual = calc.sum(3);
        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumWorksCorrect2() {
        //When
        int actual = calc.sum(1);
        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumWorksCorrect0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }

    @Test
    public void testThatSumWorksCorrect3() {
        //When
        int actual = calc.sum(4);
        //Then
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }
}
