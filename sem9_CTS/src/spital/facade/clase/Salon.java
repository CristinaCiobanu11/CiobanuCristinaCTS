package spital.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> codPaturiLibere;

    public Salon(){
        codPaturiLibere=new ArrayList<>();
    }

    public boolean verificaPaturiLibere(){
        return codPaturiLibere.size()>0;
    }

    public void adaugaPaturiLibere(int codPatLiber){
        codPaturiLibere.add(codPatLiber);
    }

    public void ocupaPat(){
        codPaturiLibere.remove(0);
    }

}
