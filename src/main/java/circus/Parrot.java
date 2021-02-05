package circus;

public class Parrot extends Bird {
    @Override
    public String speak() {
        return "Polly wants a cracker";
    }

    @Override
    public String toString() {
        return "I'm a parrot";
    }

    // use ctrl o to select method to overide
    @Override
    public int getValue() {
        return 20;
    }
}
