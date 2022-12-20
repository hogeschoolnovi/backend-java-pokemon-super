public class Pikachu extends Pokemon {
  private final String ability = "Static";

  public Pikachu(Stats stats, Move[] moveset, int[] iv, int[] ev) {
    super("Pikachu", "Electric", "none", stats, new Moveset(moveset), iv, ev);
  }
}
