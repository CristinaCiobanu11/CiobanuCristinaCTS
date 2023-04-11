package builder.models;

public class ContBancarBuilder implements IBuilder {
    public boolean primesteSalariu;
    private String numeClient;
    private boolean cardAtasat;
    private boolean internetBanking;

    public ContBancarBuilder() {
        this.primesteSalariu = false;
        this.cardAtasat = false;
        this.internetBanking = false;
        this.numeClient = "Anonim";
    }

    public ContBancarBuilder(boolean primesteSalariu, String numeClient, boolean cardAtasat, boolean internetBanking) {
        this.primesteSalariu = primesteSalariu;
        this.numeClient = numeClient;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }

    public IBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
        return this;
    }

    public IBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public IBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public IBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBancar build() {
        ContBancar cont = new ContBancar(this.primesteSalariu, this.numeClient, this.cardAtasat, this.internetBanking);
        return cont;
    }
}
