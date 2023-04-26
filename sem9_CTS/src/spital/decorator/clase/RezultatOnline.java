package spital.decorator.clase;

public class RezultatOnline extends DecoratorAbstract{
    public RezultatOnline(FurnizeazaRezultat atribut) {
        super(atribut);
    }

    @Override
    public void afiseazaRezultatOnline(String diagnostic) {
        System.out.println("Site: "+diagnostic);
    }
}
