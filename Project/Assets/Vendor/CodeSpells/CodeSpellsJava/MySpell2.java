import june.*;

public class Up extends Spell{
  public void cast(){
    Enchanted me = getByName("Me");
    me.move(Direction.up(), 10.0f);
  }
}
