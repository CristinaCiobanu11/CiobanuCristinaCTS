package composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements UnitateBancara{

    private String nume;
    private int nrAngajati;

    public List<UnitateBancara> lista;

    public Sucursala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.lista=new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        lista.add(unitateBancara);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        lista.remove(unitateBancara);
    }

    @Override
    public UnitateBancara printUnitate(int index) {
        return lista.get(index);
    }

    @Override
    public void printDescriere(String indentare) {
        System.out.println(indentare+"Sucursala "+this.nume+ " are "+ this.nrAngajati+" angajati");
        for(UnitateBancara unitateBancara : lista){
            unitateBancara.printDescriere("  "+indentare);
        }
    }
}
