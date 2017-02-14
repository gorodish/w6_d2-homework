public class Human implements Edible, Swimmable {

  private int nutrition;

  public Human(int nutrition) {
    this.nutrition = nutrition;
  }

  public String speak() {
    return "Help I'm being eaten by a bear!";
  }

  public int nutritionalValue() {
    return nutrition;
  }
  // public String swim() {
  //   return "Swimming";
  // }
}