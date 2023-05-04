package flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory{
    private Map<String, IClientBancar> mapCont;

    public FlyweightFactory(){
        this.mapCont=new HashMap<>();
    }

    public IClientBancar getDetinator(String nume, String nrTelefon, String adresa){
        if(!mapCont.containsKey(nume)){
            IClientBancar client=new Detinator(nume, nrTelefon, adresa);
            mapCont.put(nume, client);
            return client;
        }
        return mapCont.get(nume);
    }
}
