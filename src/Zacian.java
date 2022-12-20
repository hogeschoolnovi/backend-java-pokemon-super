public class Zacian extends Pokemon {
  private final String ability = "Intrepid Sword";

  public Zacian(Stats stats, Move[] moveset, int[] iv, int[] ev) {
    super("Zacian", "Fairy", "Steel", stats, new Moveset(moveset), iv, ev);
  }
}
