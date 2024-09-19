abstract class Character implements Cloneable {
  private final String name;
  private final int health;
  private final int attack;
  private final int speed;

  public Character(String name, int health, int attack, int speed) {
    this.name = name;
    this.health = health;
    this.attack = attack;
    this.speed = speed;
  }

  abstract void display();

  public Object clone() {
    try {
      return super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("Unexpected internal error: " + e.getMessage());
      return null;
    }
  }

  public String getName() {
    return name;
  }

  public int getHealth() {
    return health;
  }

  public int getAttack() {
    return attack;
  }

  public int getSpeed() {
    return speed;
  }
}