public class Warrior {
    protected String name = "Warrior";
    public int health = 0;
    public int attkMax = 0;
    public int blockMax = 0;

    public Warrior() {

    }

    public Warrior(String name, int health, int attkMax, int blockMax) {
        this.setName(name);
        this.health = health;
        this.attkMax = attkMax;
        this.blockMax = blockMax;
    }

    // ATTACK
    public int attack() {
        return 1 + (int)(Math.random() * ((attkMax - 1) + 1));
    }

    // BLOCK
    public int block() {
        return 1 + (int)(Math.random() * ((blockMax - 1) + 1));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttkMax() {
        return attkMax;
    }

    public void setAttkMax(int attkMax) {
        this.attkMax = attkMax;
    }

    public int getBlockMax() {
        return blockMax;
    }

    public void setBlockMax(int blockMax) {
        this.blockMax = blockMax;
    }
}
