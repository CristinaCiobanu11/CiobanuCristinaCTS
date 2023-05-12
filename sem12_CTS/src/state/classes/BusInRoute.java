package state.classes;

public class BusInRoute implements IBusState {

    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusEndOfRoute) {
            System.out.println("The bus " + bus.getLicensePlate() + " has left in a new route.");
            bus.setState(this);
        } else {
            System.out.println("The bus " + bus.getLicensePlate() + " cannot leave in the new route.");
        }
    }

}