package command.classes;

public class CommandPlecareInCursa implements ICommand {
    private int numarLinie;
    private Automobil automobil;

    public CommandPlecareInCursa(int numarLinie, Automobil automobil) {
        this.numarLinie = numarLinie;
        this.automobil = automobil;
    }

    @Override
    public void execute() {
        automobil.pleacaInCursa(this.numarLinie);
    }
}