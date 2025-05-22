public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Mammal("Lion", 8, 150);
        Animal eagle = new Bird("Eagle", 10, 1000);
        Animal crocodile = new Reptile("Crocodile", 4, "Green");
        lion.move();
        ((Mammal) lion).jump();
        System.out.println("===============");
        eagle.makeSound();
        ((Bird) eagle).fly();
        System.out.println("===============");
        crocodile.move();
        ((Reptile) crocodile).spin();
        System.out.println("===============");
        lion.displayInformation();
        System.out.println("===============");
        eagle.displayInformation();
        System.out.println("===============");
        crocodile.displayInformation();
        System.out.println("===============");
        lion.naturalHabitat();
        System.out.println("===============");
        eagle.naturalHabitat();
        System.out.println("===============");
        crocodile.naturalHabitat();
        System.out.println("===============");


    }
}
