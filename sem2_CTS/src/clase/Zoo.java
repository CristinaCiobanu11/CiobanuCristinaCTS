package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String zooName;
    private ZooKeeper zooKeeper;
    private List<Animal> animals;

    public Zoo(String zooName, ZooKeeper zooKeeper) {
        this.zooName = zooName;
        this.zooKeeper = zooKeeper;
        this.animals = new ArrayList<>();
    }

    public void feedAllAnimals(){
        if(this.animals!=null && this.zooKeeper!=null){
            for (Animal animal : this.animals){
                this.zooKeeper.feedAnimal(animal);
            }
        }
    }

    public void addAnimal(Animal animal){
        if (this.animals!=null){
            this.animals.add(animal);
        }
    }

}
