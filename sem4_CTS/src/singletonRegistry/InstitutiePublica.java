package singletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {

    private String denumire;
    private int numarAngajati;

    private static Map<String, InstitutiePublica> registruInstitutii = new HashMap<>();

    private InstitutiePublica(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    public synchronized static InstitutiePublica getInstitutie(String denumire) {
        if(registruInstitutii.containsKey(denumire)) {
            return registruInstitutii.get(denumire);
        }
        else {
            registruInstitutii.put(denumire ,new InstitutiePublica(denumire, 0));
            return registruInstitutii.get(denumire);
        }

    }

    public void setNrAngajati(int nrAngajati){
        this.numarAngajati=nrAngajati;
    }

    @Override
    public String toString() {
        return "InstitutiePublica{" +
                "denumire='" + denumire + '\'' +
                ", numarAngajati=" + numarAngajati +
                '}';
    }


}