import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RPSTest {
    @Test
    public void classReturnsGestureNameRock(){
        assertEquals("ROCK", rock.getName());
    }
}
