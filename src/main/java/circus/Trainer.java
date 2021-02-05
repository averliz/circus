package circus;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting - note no need to upcast explicitly
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        train(new Parrot());
//        circus.Animal a2 = new circus.Animal();
//        circus.Bird b2 = new circus.Bird();
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
