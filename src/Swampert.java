public class Swampert extends Pokemon {
  private final String ability = "Torrent";

  public Swampert(Stats stats, Move[] moveset, int[] iv, int[] ev) {
    super("Swampert", "Water", "Ground", stats, new Moveset(moveset), iv, ev);
  }
}
