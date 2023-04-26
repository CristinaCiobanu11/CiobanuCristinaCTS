package spital.facade.clase;

public class Facade {
    
    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic=new Medic();
        medic.adaugarePacient(new Pacient("Andrei", 5));
        medic.adaugarePacient(new Pacient("Alex", 2));
        medic.adaugarePacient(new Pacient("Maria", 5));
        this.salon=new Salon();
        salon.adaugaPaturiLibere(23);
        salon.adaugaPaturiLibere(33);
    }

    public void interneazaPacient(String nume){
        if(medic.verificaTrimitere(medic.getPacient(nume))){
            if(salon.verificaPaturiLibere()){
                if(medic.getPacient(nume).getGravitate()>4){
                    salon.ocupaPat();
                    System.out.println("Pacientul "+nume+" este internat");
                }
                else{
                    System.out.println("Pacientul "+ nume+ " nu este grav afectat");
                }
            }
            else{
                System.out.println("Nu avem paturi libere");
            }
                
        }
        else{
            System.out.println("Trebuie sa aveti trimitere de la medic");
        }
    }
}
