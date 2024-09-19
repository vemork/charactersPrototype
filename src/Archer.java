class Archer extends Character {
  public Archer() {
    super("Archer", 80, 15, 7);
  }

  @Override
  void display() {
    System.out.println(this.getName() + " with health: " + this.getHealth() + ", attack: " + this.getAttack() + ", speed: " + this.getSpeed());
  }
}