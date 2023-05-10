package state.models;

public class StareLibera implements IState{
    @Override
    public void modificare(Masa masa) {
        if(!(masa.getStare() instanceof StareLibera)){
            System.out.println("Masa este libera acum.");
            masa.setStare(this);
        }else{
            System.out.println("Masa este deja libera.");
        }
    }
}
