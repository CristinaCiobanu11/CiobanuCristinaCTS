package state.classes;

public class BusInService implements IBusState {

    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusEndOfRoute) {
            System.out.println("The bus " + bus.getLicensePlate() + " is now in service.");
            bus.setState(this);
        } else {
            System.out.println("The bus " + bus.getLicensePlate() + " cannot go in service.");
        }
    }

}