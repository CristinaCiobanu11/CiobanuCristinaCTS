package simpleFactory;

public class SimpleFactory {
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume){
        switch(tipPersonal){
            case Medic:return new Medic(nume);
            case Brancardier: return new Brancardier(nume);
            case Asistent: return new Asistent(nume);
            default: return null;
        }
    }

    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, Integer anVechime){
        switch(tipPersonal){
            case Anestezist: return new Asistent(nume);
            default: return  createPersonal(tipPersonal, nume);
        }
    }
}