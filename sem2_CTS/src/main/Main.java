package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Gigel");
        Zoo zoo = new Zoo("Zoo", zooKeeper);
        zoo.addAnimal(new Lion("Simba", 300));
        zoo.addAnimal(new Zebra("Gargalucius", 110));
        zoo.addAnimal(new Mainuta("Harambe", 17));
        zoo.feedAllAnimals();
    }
}
