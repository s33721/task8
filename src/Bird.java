public class Bird extends Animal {
    private int featherCount;

    public Bird(String name, int age, int featherCount) {
        super(name, age);
        this.featherCount = featherCount;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is making a sound");
    }

    @Override
    public void move() {
        System.out.println("Bird is moving");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("The feather count is " + featherCount);
    }

    @Override
    public void naturalHabitat() {
        System.out.println("Bird's natural habitat is air");
    }


}
