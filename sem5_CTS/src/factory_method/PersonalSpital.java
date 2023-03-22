package factory_method;

public abstract class PersonalSpital {
    public String nume;
    public abstract void afiseazaDescriere();

    public String getNume() {
        return nume;
    }

    public PersonalSpital(String nume){
        this.nume=nume;
    }
}
