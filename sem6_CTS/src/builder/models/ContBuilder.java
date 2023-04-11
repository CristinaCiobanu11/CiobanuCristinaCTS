package builder.models;

public class ContBuilder implements IBuilder {

    ContBancar contBancar;

    public ContBuilder() {
        this.contBancar = new ContBancar(false, "Anonim", false, false);
    }


    public ContBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.contBancar.setPrimesteSalariu(primesteSalariu);
        return this;
    }


    public ContBuilder setNumeClient(String numeClient) {
        this.contBancar.setNumeClient(numeClient);
        return this;
    }


    public ContBuilder setCardAtasat(boolean cardAtasat) {
        this.contBancar.setCardAtasat(cardAtasat);
        return this;
    }


    public ContBuilder setInternetBanking(boolean internetBanking) {
        this.contBancar.setInternetBanking(internetBanking);
        return this;
    }

    @Override
    public ContBancar build() {
        return this.contBancar;
    }
}
