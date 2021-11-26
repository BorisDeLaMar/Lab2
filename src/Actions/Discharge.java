package Actions;
import ru.ifmo.se.pokemon.*;

public class Discharge extends SpecialMove {
	public Discharge()
	{
		super(Type.GRASS, 80, 100);
	}
	@Override
	protected java.lang.String describe()
	{
		return "Discharge!"+"30% chance of paralyzing";
	}
	protected void applyOppDamage(Pokemon def, double damage)
	{
		def.setMod(Stat.HP, (int)damage);
	}
	protected void applyOppEffects(Pokemon def)
	{
		Effect effect = new Effect().chance(0.3).condition(Status.PARALYZE);
		def.addEffect(effect);
	}                         
}
