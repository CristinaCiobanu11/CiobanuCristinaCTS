package flyweight.main;

import flyweight.classes.Cont;
import flyweight.classes.FlyweightFactory;
import flyweight.classes.IClientBancar;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory fabrica=new FlyweightFactory();
        Cont cont1=new Cont(2300, 12);
        Cont cont2=new Cont(4000, 14);
        Cont cont3=new Cont(5000, 15);

        IClientBancar detinator=fabrica.getDetinator("Ion", "8888", "Ghencea");
        detinator.descriere(cont1);

        fabrica.getDetinator("Alin", "9999", "Tunari").descriere(cont2);
        fabrica.getDetinator("Ion", "8788", "Bucuresti").descriere(cont3);
        fabrica.getDetinator("Alin", "1234", "Tunari").descriere(cont1);
    }
}
