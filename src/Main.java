public class Main {
  public static void main(String[] args) {
    Stats swampertStats = new Stats(100, 110, 90, 85, 90, 60);
    Move moveOne = new Move("Water Pulse", 60, 100, "Water");
    Move moveTwo = new Move("Take Down", 90, 85, "Normal");
    Move[] swampertMoveset = { moveOne, moveTwo };

    int[] iv = { 31, 31, 31, 31, 31, 31 };
    int[] ev = { 252, 0, 144, 0, 112, 0 };

    Swampert swampert = new Swampert(swampertStats, swampertMoveset, iv, ev);
    System.out.println(swampert.attack(swampert.moveset.moveset[0], swampert));
  }
}
