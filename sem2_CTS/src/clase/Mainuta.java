package clase;

public class Mainuta extends Animal{
    public Mainuta(String nameAnimal, int age) {
        super(nameAnimal, age);
    }

    @Override
    public void eat(String keeperName) {
        System.out.println("Maimuta: " + super.getNameAnimal()
                + "\nVarsta: " + super.getAge()
                + "\nHranit de: " + keeperName);
    }
}
