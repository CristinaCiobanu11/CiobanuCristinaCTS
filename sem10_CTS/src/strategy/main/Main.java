package strategy.main;

import strategy.classes.Operator;
import strategy.classes.VerificarePJ;

public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator();
        operator.verificaClient();
        operator.setModVerificare(new VerificarePJ());
        operator.verificaClient();
    }
}
