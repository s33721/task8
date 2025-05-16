public class Mammal extends Animal {

    private double weight;

    public Mammal(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;

    }

    @Override
    public void makeSound() {
        System.out.println("Mammal is making a sound");
    }

    @Override
    public void move() {
        System.out.println("Mammal is moving");
    }

    public void jump() {
        System.out.println("Mammal is jumping");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Mammal's weight is " + weight);
    }

    @Override
    public void naturalHabitat() {
        System.out.println("Mammal's natural habitat is a desert");
    }
}
