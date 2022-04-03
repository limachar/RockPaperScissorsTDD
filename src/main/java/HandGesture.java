public class HandGesture {
    private String name;

    public HandGesture(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
