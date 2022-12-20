public class Move {
  String name;
  int power;
  int accuracy;
  Type type;

  public Move(String name, int power, int accuracy, String type) {
    this.name = name;
    this.power = power;
    this.accuracy = accuracy;
    this.type = new Type(type);
  }
}
