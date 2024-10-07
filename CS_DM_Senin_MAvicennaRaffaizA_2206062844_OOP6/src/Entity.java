public class Entity {
    private int health;
    private int damage;
    private int level;
    private AttackType attackType;
    private ClassType classType;
    private float moveSpeed;
    private String name;


    private Entity() {}


    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getLevel() {
        return level;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public ClassType getClassType() {
        return classType;
    }

    public float getMoveSpeed() {
        return moveSpeed;
    }

    public String getName() {
        return name;
    }

    public String printStats() {
        String result = "Entity ";
        if (name != null) result += name;
        result += " {\n";
        if (health != 0) result += "\tHealth: " + health + "\n";
        if (damage != 0) result += "\tDamage: " + damage + "\n";
        if (level != 0) result += "\tLevel: " + level + "\n";
        if (attackType != null) result += "\tAttack Type: " + attackType + "\n";
        if (classType != null) result += "\tClass Type: " + classType + "\n";
        if (moveSpeed != 0f) result += "\tMove Speed: " + moveSpeed + "\n";
        result += "}\n";
        System.out.println(result);
        return result;
    }


    public static class EntityBuilder {
        private Entity entity;

        public EntityBuilder() {
            reset();
        }

        public void reset() {
            entity = new Entity();
        }


        public EntityBuilder setName(String name) {
            entity.name = name;
            return this;
        }

        public EntityBuilder setHealth(int health) {
            entity.health = health;
            return this;
        }

        public EntityBuilder setDamage(int damage) {
            entity.damage = damage;
            return this;
        }

        public EntityBuilder setLevel(int level) {
            entity.level = level;
            return this;
        }

        public EntityBuilder setAttackType(AttackType attackType) {
            entity.attackType = attackType;
            return this;
        }

        public EntityBuilder setClassType(ClassType classType) {
            entity.classType = classType;
            return this;
        }

        public EntityBuilder setMoveSpeed(float moveSpeed) {
            entity.moveSpeed = moveSpeed;
            return this;
        }

        public Entity build() {
            return entity;
        }
    }
}