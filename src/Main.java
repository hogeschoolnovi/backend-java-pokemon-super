public class Main {
  public static void main(String[] args) {
    Stats swampertStats = new Stats(100, 110, 90, 85, 90, 60);
    Stats zacianStats = new Stats(92, 170, 115, 80, 115, 148);
    Stats zamazentaStats = new Stats(92, 130, 145, 80, 145, 128);
    Stats pikachuStats = new Stats(35, 55, 40, 50, 50, 90);


    Move swampertMoveOne = new Move("Water Pulse", 60, 100, "Water");
    Move swampertMoveTwo = new Move("Take Down", 90, 85, "Normal");
    Move[] swampertMoveset = { swampertMoveOne, swampertMoveTwo };

    Move zacianMoveOne = new Move("Behemoth Blade", 100, 100, "Steel");
    Move[] zacianMoveset = { zacianMoveOne };

    Move zamazentaMoveOne = new Move("Behemoth Bash", 100, 100, "Steel");
    Move[] zamazentaMoveset = { zamazentaMoveOne };

    Move pikachuMoveOne = new Move("Thunder Shock", 40, 100, "Electric");
    Move[] pikachuMoveset = { pikachuMoveOne };

    int[] iv = { 31, 31, 31, 31, 31, 31 };
    int[] ev = { 252, 0, 144, 0, 112, 0 };

    Swampert swampert = new Swampert(swampertStats, swampertMoveset, iv, ev);
    Zacian zacian = new Zacian(zacianStats, zacianMoveset, iv, ev);
    Zamazenta zamazenta = new Zamazenta(zamazentaStats, zamazentaMoveset, iv, ev);
    Pikachu pikachu = new Pikachu(pikachuStats, pikachuMoveset, iv, ev);


    System.out.println(zacian.attack(zacian.moveset.moveset[0], pikachu));
  }
}
