public class LevelOne {
    public static void main(String[] args) {
        Entity.EntityBuilder builder = new Entity.EntityBuilder();
        Spawner spawner = new Spawner();

        Entity slimeOne = spawner.spawnSlime(builder);
        Entity player = spawner.spawnPlayer(builder);
        Entity tree = spawner.spawnTree(builder);

        slimeOne.printStats();
        player.printStats();
        tree.printStats();
    }
}