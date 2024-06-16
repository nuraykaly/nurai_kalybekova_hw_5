public class Hero {
    // Приватные поля
    private int health;
    private int damage;
    private String superpower;

    // Конструктор, задающий все поля
    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    // Конструктор, задающий только здоровье и урон
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superpower = "No superpower";
    }

    // Геттеры
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}
