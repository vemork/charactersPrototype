class Soldier extends Character {
  public Soldier() {
    super("Soldier", 100, 20, 5);
  }

  @Override
  void display() {
    System.out.println(this.getName() + " with health: " + this.getHealth() + ", attack: " + this.getAttack() + ", speed: " + this.getSpeed());
  }
}