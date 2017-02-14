import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.*;

public class BearTest {

  Bear bear;
  Salmon salmon;
  Human human;
  Chicken chicken;

  @Before 
  public void before() {
    bear = new Bear("Baloo");
    human = new Human(500);
    salmon = new Salmon(200);
    chicken = new Chicken(100);
  }

  @Test
  public void hasName(){
    assertEquals("Baloo", bear.getName());
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon);
    assertEquals(bear.foodCount(), 1);
  }

  @Test
  public void shouldEmptyBellyAfterSleeping(){
    bear.eat(salmon);
    bear.sleep();
    assertEquals(bear.foodCount(), 0);
  }

  @Test
  public void canEatHuman() {
    bear.eat(human);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canThrowUp() {
    bear.eat(salmon);
    Edible food = bear.throwUp();
    assertNotNull(food);
    Salmon original = (Salmon)food;
    assertEquals("swimming", original.swim());
  }

  @Test
  public void canEatChicken() {
    bear.eat(chicken);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void chickenCanCluck() {
    assertEquals("Cluck cluck!", chicken.speak());
  }

  @Test
  public void canThrowUpChicken() {
    bear.eat(chicken);
    Edible food = bear.throwUp();
    assertNotNull(food);
    Chicken first = (Chicken)food;
    assertEquals("Cluck cluck!", first.speak());
  }

  @Test
  public void hasTotalNutritionalValue() {

  }
}