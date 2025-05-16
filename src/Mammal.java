public class Mammal extends Animal {


    public Mammal(String name, int age) {
        super(name, age);

    }

    @Override
    public void makeSound() {
        System.out.println("Mammal is making a sound");
    }

    @Override
    public void move() {
        System.out.println("Mammal is moving");
    }

}
