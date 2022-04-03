import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

public class Computer {

    private Map<HandGesture, Integer> availableGestures = new HashMap<>();


    public Computer(HandGesture first, HandGesture second, HandGesture third) {
        this.availableGestures.put(first, 0);
        this.availableGestures.put(second, 1);
        this.availableGestures.put(third, 2);

    }

    public Integer generateRandomNumber() {
        Random rand = new Random();
        int generatedRandom = rand.nextInt(3);

        return generatedRandom;
    }

    public String findAvailableGestureByNumber(int value) {
        return availableGestures.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), value))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet())
                .toString().replace("[", "").replace("]", "");
    }
}
