package factory_method;

public class Asistent extends PersonalSpital {

    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.getNume() + " este asistenta");
    }
}