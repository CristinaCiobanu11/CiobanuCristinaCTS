package builder.models;

public class ContBancar {
    public boolean primesteSalariu;
    private String numeClient;
    private boolean cardAtasat;
    private boolean internetBanking;

    protected ContBancar(boolean primesteSalariu, String numeClient, boolean cardAtasat, boolean internetBanking) {
        this.primesteSalariu = primesteSalariu;
        this.numeClient = numeClient;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }


    protected void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }


    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }


    protected void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }


    protected void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConBancar{");
        sb.append("primesteSalariu=").append(primesteSalariu);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append('}');
        return sb.toString();
    }
}
