public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 12, 1000, "Yellow", "pika pika");
        FirePokemon charmander = new FirePokemon("Charmander", 16, 993, 120, "Orange");
        FirePokemon specialFire = new FirePokemon("Dragonite", 1000, 3, 50, "Blue");
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 14, 875, 2, true);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 13, 345, false, 50);
        WaterIcePokemon dewgong = new WaterIcePokemon("Dewgong", 17, 764, true, 60, "White", -20);

        System.out.println();
        System.out.println("We start with " + pikachu.getName());
        pikachu.tackle();
        pikachu.makeSound();
        pikachu.lightningBolt();

        System.out.println();
        System.out.println("Next up is " + charmander.getName());
        charmander.flameThrower();
        charmander.tackle();
        charmander.levelUp();

        System.out.println();
        System.out.println("Next up is " + specialFire.getName());
        specialFire.flameThrower();
        specialFire.tackle();
        specialFire.levelUp();

        System.out.println();
        System.out.println("Next up is " + bulbasaur.getName());
        bulbasaur.throwLeaf();
        bulbasaur.growSeed();
        bulbasaur.throwLeaf();
        bulbasaur.throwLeaf();
        bulbasaur.levelUp();

        System.out.println();
        System.out.println("Next up is " + squirtle.getName());
        System.out.println("This pokemon has type: " + squirtle.getType());
        squirtle.tackle();
        squirtle.toggleLivesInWater(true);
        System.out.println("Squirtle now lives in water");
        squirtle.tackle();
        squirtle.waterGun();

        System.out.println();
        System.out.println("Next up is " + dewgong.getName() + ", a special pokemon with two types");
        System.out.println("This pokemon has type: " + dewgong.getType());
        dewgong.eats();
        dewgong.tackle();
        dewgong.freeze();
        dewgong.waterGun();
        dewgong.icicle();

    }
}
