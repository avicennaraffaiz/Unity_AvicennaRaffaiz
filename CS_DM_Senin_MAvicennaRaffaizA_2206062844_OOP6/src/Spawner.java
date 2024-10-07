public class Spawner {

    public Entity spawnSlime(Entity.EntityBuilder builder) {
        builder.reset();
        return builder
                .setName("Slime")
                .setHealth(100)
                .setDamage(3)
                .setAttackType(AttackType.LOW_RANGE)
                .setLevel(1)
                .setMoveSpeed(5)
                .build();
    }

    public Entity spawnPlayer(Entity.EntityBuilder builder) {
        builder.reset();
        return builder
                .setName("Player")
                .setHealth(500)
                .setDamage(50)
                .setAttackType(AttackType.HIGH_RANGE)
                .setClassType(ClassType.WIZARD) // Class type is specific to Player
                .setLevel(1)
                .setMoveSpeed(25)
                .build();
    }

    public Entity spawnTree(Entity.EntityBuilder builder) {
        builder.reset();
        return builder
                .setName("Tree")
                .setHealth(100)
                .build();
    }
}