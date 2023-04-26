package spital.decorator.clase;

public class RezultatPeHartie implements FurnizeazaRezultat{
    @Override
    public void afiseazaRezultat(String diagnostic) {
        System.out.println("Harie: "+diagnostic);
    }
}
