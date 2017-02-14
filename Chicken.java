public class Chicken implements Edible {

  private int nutrition;

  public Chicken(int nutrition) {
    this.nutrition = nutrition;
  }

  public String speak() {
    return "Cluck cluck!";
  }

  public int nutritionalValue() {
    return nutrition;
  }
}