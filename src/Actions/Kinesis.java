package Actions;
import ru.ifmo.se.pokemon.*;

public class Kinesis extends PhysicalMove {
	public Kinesis()
	{
		super(Type.DRAGON, 0, 80);
	}
	@Override
	protected java.lang.String describe()
	{
		return "Kinesis!"+"100% chance of decreasing accuracy";
	}
	protected void applyOppDamage(Pokemon def, double damage)
	{
		def.setMod(Stat.HP, (int)damage);
	}
	protected void applyOppEffects(Pokemon def)
	{
		Effect effect = new Effect().chance(1).stat(Stat.ACCURACY, -1);
		def.addEffect(effect);
	}
}
