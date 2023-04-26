package spital.decorator.clase;

public abstract class DecoratorAbstract implements FurnizeazaRezultat{
    private FurnizeazaRezultat atribut;
    @Override
    public void afiseazaRezultat(String diagnostic) {
        atribut.afiseazaRezultat(diagnostic);
    }

    public DecoratorAbstract(FurnizeazaRezultat atribut) {
        this.atribut = atribut;
    }

    public abstract void afiseazaRezultatOnline(String diagnostic);

}
