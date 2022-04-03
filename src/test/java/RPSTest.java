import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RPSTest {

    Rock rock = new Rock("ROCK");
    Papers paper = new Papers("PAPER");
    Scissors scissors = new Scissors("SCISSORS");

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
}
