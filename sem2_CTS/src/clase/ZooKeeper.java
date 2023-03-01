package clase;

public class ZooKeeper {
    private String ZooKeeperName;

    public ZooKeeper(String zooKeeperName) {
        ZooKeeperName = zooKeeperName;
    }

    public void feedAnimal(Animal animal){
        if (animal!=null){
            animal.eat(this.ZooKeeperName);
        }
    }
}
