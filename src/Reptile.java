public class Reptile extends Animal {
    private String color;

    public Reptile(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Reptile is making sound");
    }

    @Override
    public void move() {
        System.out.println("Reptile is moving");
    }

    public void spin() {
        System.out.println("Reptile is spinning");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Reptile color: " + color);
    }

    @Override
    public void naturalHabitat() {
        System.out.println("Reptile's natural habitat is somewhere with water, land and sunlight");
    }
}
