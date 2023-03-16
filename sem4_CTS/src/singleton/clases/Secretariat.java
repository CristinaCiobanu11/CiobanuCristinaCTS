package singleton.clases;

public class Secretariat {
    private int nrBirou;
    private int nrAngajati;

    private static Secretariat instanta;

    private Secretariat(int nrBirou, int nrAngajati) {
        this.nrBirou = nrBirou;
        this.nrAngajati = nrAngajati;
    }

    public synchronized static Secretariat getInstanta(int nrBirou, int nrAngajati) {
        if(instanta==null){
            instanta=new Secretariat(nrBirou, nrAngajati);
        }
        return Secretariat.instanta;
    }//sync ca sa fie threadsafe

    public Secretariat() {
    }

    @Override
    public String toString() {
        return "Secretariat{" +
                "nrBirou=" + nrBirou +
                ", nrAngajati=" + nrAngajati +
                '}';
    }
}
