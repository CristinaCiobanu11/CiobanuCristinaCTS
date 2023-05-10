package state.models;

public class StareRezervata implements IState{
    @Override
    public void modificare(Masa masa) {
        if((masa.getStare() instanceof StareLibera)){
            System.out.println("Masa este rezervata acum.");
            masa.setStare(this);
        }else{
            System.out.println("Masa nu poate fi rezervata.");
        }
    }
}
