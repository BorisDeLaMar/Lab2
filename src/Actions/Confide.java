package Actions;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
	public Confide()
	{
		super(Type.GRASS, 0, 100);
	}
	@Override
	protected java.lang.String describe()
	{
		return "Confide!"+"That's base!";
	}
	protected void applyOppDamage(Pokemon def, double damage)
	{
		def.setMod(Stat.HP, (int)damage);
	}
	protected void applyOppEffects(Pokemon def)
	{
		Effect effect = new Effect().chance(1).stat(Stat.SPECIAL_ATTACK, -1);
		def.addEffect(effect);
	}
}
