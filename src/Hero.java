class Hero extends Character {
  public Hero() {
    super("Hero", 150, 25, 10);
  }

  @Override
  void display() {
    System.out.println(this.getName() + " with health: " + this.getHealth() + ", attack: " + this.getAttack() + ", speed: " + this.getSpeed());
  }
}