package Actions;
import ru.ifmo.se.pokemon.*;

public class Confusion extends SpecialMove {
	public Confusion()
	{
		super(Type.ELECTRIC, 50, 100);
	}
	@Override
	protected java.lang.String describe()
	{
		return "Confusion!"+"10% chance of total confuse";
	}
	protected void applyOppDamage(Pokemon def, double damage)
	{
		def.setMod(Stat.HP, (int)damage);
	}
}
