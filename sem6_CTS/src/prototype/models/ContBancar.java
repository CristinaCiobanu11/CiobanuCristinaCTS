package prototype.models;

import java.util.HashMap;
import java.util.Map;

public class ContBancar implements IContCloneable{

    private String detinator;
    private Map<String, Integer> documente;
    private int numarFileDosar;

    public ContBancar(String detinator, Map<String, Integer> documente, int numarFileDosar) {
        int sum = 0;
        for (Integer file : documente.values()) {
            sum += file;
        }
        if (sum == numarFileDosar) {
            this.detinator = detinator;
            this.documente = documente;
            this.numarFileDosar = numarFileDosar;
        }
        else {
            throw new IllegalArgumentException("Numar incorect de file in dosar");
        }
    }

    private ContBancar(){
        this.documente=null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("detinator='").append(detinator).append('\'');
        sb.append(", documente=").append(documente);
        sb.append(", numarFileDosar=").append(numarFileDosar);
        sb.append('}');
        return sb.toString();
    }

    public IContCloneable cloneaza(){
        ContBancar contCopie=new ContBancar();
        contCopie.detinator=this.detinator;
        contCopie.numarFileDosar=this.numarFileDosar;

        contCopie.documente=new HashMap<>();
        for(String key:this.documente.keySet()){
            contCopie.documente.put(key, this.documente.get(key));
        }
        return contCopie;
    }
}
