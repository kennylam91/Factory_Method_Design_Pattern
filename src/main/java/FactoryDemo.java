public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal firstAnimal = animalFactory.getAnimal("dog");
        System.out.println(firstAnimal.makeSound());

        Animal secondAnimal = animalFactory.getAnimal("cat");
        System.out.println(secondAnimal.makeSound());
    }
}
