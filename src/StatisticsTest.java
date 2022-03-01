import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsTest {



    @Test
    public void ShouldDroppedOut() {
        int[] speedOfPlayer = {5, 0, 2};
        int[] actual = Statistics.droppedOut(speedOfPlayer);
        int[] expected = {5, 2};
        Assertions.assertArrayEquals(expected,actual);


    }

    @Test
    public void ShouldRemainOut() {
        int[] speedOfPlayer = {5, 0, 2};
        int[] actual = Statistics.remain(speedOfPlayer);
        int[] expected = {0};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void ShouldSumDroppedOut() {
        int[] speedOfPlayer = {5, 0, 2};
        int actual = Statistics.alldroppedOut(speedOfPlayer);
        int expected = 2;
    }
}


