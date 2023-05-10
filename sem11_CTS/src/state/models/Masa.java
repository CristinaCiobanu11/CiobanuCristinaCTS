package state.models;

public class Masa {
    private int numar;

    private IState stare;

    public Masa(int numar) {
        this.numar = numar;
        this.stare = (IState) new StareLibera();
    }

    protected void setStare(IState s){
        this.stare=s;
    }

    public int getNumar() {
        return numar;
    }

    public IState getStare() {
        return stare;
    }

    public void ocupaMasa(){
        IState stare=new StareOcupata();
        stare.modificare(this);
    }

    public void rezervaMasa(){
        IState stare=new StareRezervata();
        stare.modificare(this);
    }

    public void elibereazaMasa(){
        IState stare=new StareLibera();
        stare.modificare(this);
    }

    public void anulareRezervare(){
        IState stare=new StareLibera();
        stare.modificare(this);
    }
}
