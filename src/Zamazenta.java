public class Zamazenta extends Pokemon {
  private final String ability = "Dauntless Shield";

  public Zamazenta(Stats stats, Move[] moveset, int[] iv, int[] ev) {
    super("Zamazenta", "Fighting", "Steel", stats, new Moveset(moveset), iv, ev);
  }
}
