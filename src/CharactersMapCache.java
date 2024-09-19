import java.util.HashMap;
import java.util.Map;

class CharactersMapCache {
  private static final Map<String, Character> charactersMap = new HashMap<>();

  public static Character getCharacter(String unitType) {
    Character cachedUnit = charactersMap.get(unitType);
    return (Character) cachedUnit.clone();
  }

  public static void loadCache() {
    Soldier soldier = new Soldier();
    charactersMap.put("Soldier", soldier);

    Archer archer = new Archer();
    charactersMap.put("Archer", archer);

    Hero hero = new Hero();
    charactersMap.put("Hero", hero);
  }
}