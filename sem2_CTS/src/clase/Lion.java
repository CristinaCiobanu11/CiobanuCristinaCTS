package clase;

public class Lion extends Animal{

    public Lion(String nameAnimal, int age) {
        super(nameAnimal, age);
    }

    @Override
    public void eat(String keeperName) {
        System.out.println("Leu: " + super.getNameAnimal()
                + "\nVarsta: " + super.getAge()
                + "\nHranit de: " + keeperName);
    }
}
