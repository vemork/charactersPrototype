public class Game {
  public static void main(String[] args) {
    CharactersMapCache.loadCache();

    Character clonedSoldier = CharactersMapCache.getCharacter("Soldier");
    clonedSoldier.display();

    Character clonedArcher = CharactersMapCache.getCharacter("Archer");
    clonedArcher.display();

    Character clonedHero = CharactersMapCache.getCharacter("Hero");
    clonedHero.display();
  }
}