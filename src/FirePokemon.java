public class FirePokemon extends Pokemon{
    private int temperature;
    private String flameColor;

    public FirePokemon(String name, int level, int hp, int temperature, String flameColor) {
        super(name, level, hp);
        super.setType("Fire");

        this.temperature = temperature;
        this.flameColor = flameColor;
    }

    @Override
    public void eats() {
        System.out.println(super.getName() + " eats fire food.");
    }

    @Override
    public void tackle() {
        super.tackle();
        if(temperature > 70){
            System.out.println("and burns its opponent");
        }
    }

    public void flameThrower(){
        System.out.println(super.getName() + " shoots a massive " + flameColor + " flame at its opponent.");
    }
}
