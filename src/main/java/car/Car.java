package car;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(int power) {
//        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
//        int number = randomNumberGenerator.generate();
        if (power >= 4) {
            position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
