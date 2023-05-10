package state.models;

public class StareOcupata implements IState{
    @Override
    public void modificare(Masa masa) {
        if(!(masa.getStare() instanceof StareOcupata)){
            System.out.println("Masa este ocupata acum.");
            masa.setStare(this);
        }else{
            System.out.println("Masa e deja ocupata.");
        }
    }
}
