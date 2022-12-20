import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Pokemon {
  String name;
  Type primaryType;
  Type secondaryType;
  Stats stats;
  Moveset moveset;
  private int[] iv;
  private int[] ev;

  public Pokemon(String name, String primaryType, String secondaryType, Stats stats, Moveset moveset, int[] iv, int[] ev) {
    this.name = name;
    this.primaryType = new Type(primaryType);
    this.secondaryType = new Type(secondaryType);
    this.stats = stats;
    this.moveset = moveset;
    this.iv = iv;
    this.ev = ev;
  }

  public double attack(Move attackMove, Pokemon defendingPokemon) {
    // Reference: https://bulbapedia.bulbagarden.net/wiki/Damage
    // Assuming level 50
    double atkStat = this.stats.atk;
    double defStat = defendingPokemon.stats.def;

    double critical = Math.random() * 24 == 1 ? 1.5 : 1;
    double random = ThreadLocalRandom.current().nextInt(85, 100 + 1) / 100.0;
    double stab = 1;

    if (attackMove.type == this.primaryType || attackMove.type == this.secondaryType) {
      stab = 1.5;
    }

    double typeEff = Types.getCalc(attackMove.type, defendingPokemon.primaryType);
    if (Arrays.asList(Types.types).contains(defendingPokemon.secondaryType.type)) typeEff *= Types.getCalc(attackMove.type, defendingPokemon.secondaryType);

    return Math.floor((((2.0 * 50 / 5 + 2) * attackMove.power * (atkStat / defStat)) / 50 + 2) * critical * random * stab);
  }
}
