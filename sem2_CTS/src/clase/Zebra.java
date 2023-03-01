package clase;

public class Zebra extends Animal{

    public Zebra(String nameAnimal, int age) {
        super(nameAnimal, age);
    }

    @Override
    public void eat(String keeperName) {
        System.out.println("Zebra: " + super.getNameAnimal()
                + "\nVarsta: " + super.getAge()
                + "\nHranit de: " + keeperName);
    }
}
