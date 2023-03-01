package clase;

public abstract class Animal {
    private String NameAnimal;
    private int age;

    public Animal(String nameAnimal, int age) {
        NameAnimal = nameAnimal;
        this.age = age;
    }

    public String getNameAnimal() {
        return NameAnimal;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat(String keeperName);
}
