package command.main;

import command.classes.Autobuz;
import command.classes.CommandPlecareInCursa;
import command.classes.ManagerComenzi;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();
        Autobuz autobuz = new Autobuz(122);
        managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(121)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(12, new Autobuz(321)));
        managerComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(111)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}