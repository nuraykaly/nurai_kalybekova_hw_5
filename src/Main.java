public class Main {
    public static void main(String[] args) {
        // Создание экземпляра босса
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(150);
        boss.setDefenseType("Physical");

        // Печать информации о боссе
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss defense type: " + boss.getDefenseType());

        // Вызов метода createHeroes и печать информации о героях
        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero health: " + hero.getHealth());
            System.out.println("Hero damage: " + hero.getDamage());
            System.out.println("Hero superpower: " + hero.getSuperpower());
        }
    }

    // Метод createHeroes
    public static Hero[] createHeroes() {
        // Создание героев с использованием разных конструкторов
        Hero hero1 = new Hero(300, 50, "Fireball");
        Hero hero2 = new Hero(250, 70, "Lightning");
        Hero hero3 = new Hero(200, 40); // Без суперспособности

        // Помещение героев в массив и возврат массива
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}