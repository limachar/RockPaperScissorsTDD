import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RPSTest {

    Rock rock = new Rock("ROCK");
    Papers paper = new Papers("PAPER");
    Scissors scissors = new Scissors("SCISSORS");
    Computer computer = new Computer(rock, paper, scissors);

    @Test
    public void classReturnsGestureNameRock(){
        assertEquals("ROCK", rock.getName());
    }
    @Test
    public void classReturnsGestureNamePaper(){
        assertEquals("PAPER", paper.getName());
    }
    @Test
    public void classReturnsGestureNameScissors(){
        assertEquals("SCISSORS", scissors.getName());
    }
    @RepeatedTest(10)
    public void computerGeneratesRandomNumber3Bound(){
        Integer[] expectedNumbers = {0, 1, 2};
        List<Integer> numbers = new ArrayList<>(Arrays.asList(expectedNumbers));

        assertTrue(numbers.contains(computer.generateRandomNumber()));
    }
    @Test
    public void computerReturnsKeyFromValueIterationOverHashMap(){
        assertEquals("ROCK", computer.findAvailableGestureByNumber(0));
    }
}
