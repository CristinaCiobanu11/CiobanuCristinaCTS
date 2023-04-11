package builder.models;

public interface IBuilder {
    public ContBancar build();

    public IBuilder setPrimesteSalariu(boolean primesteSalariu);

    public IBuilder setNumeClient(String numeClient);

    public IBuilder setCardAtasat(boolean cardAtasat);

    public IBuilder setInternetBanking(boolean internetBanking);
}
