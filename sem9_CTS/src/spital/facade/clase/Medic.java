package spital.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    private List<Pacient> pacienti;
    public Medic(){
        this.pacienti=new ArrayList<>();
        }

        public void adaugarePacient(Pacient numePacient){
        this.pacienti.add(numePacient);
    }

    public boolean verificaTrimitere(Pacient pacient){
            return this.pacienti.contains(pacient);
    }

    public Pacient getPacient(String nume){
        for(Pacient pacient:pacienti)
        {
            if(pacient.getNume().equals(nume))
                return pacient;
        }
        return null;
    }

}
