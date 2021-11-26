package Actions;
import ru.ifmo.se.pokemon.*;

public class Rest extends PhysicalMove {
	public Rest()
	{
		super(Type.POISON, 0, 100);
	}
	@Override
	protected java.lang.String describe()
	{
		return "Rest!"+"I'm chilling yet";
	}
	protected void applyOppDamage(Pokemon def, double damage)
	{
		def.setMod(Stat.HP, (int)damage);
	}
}
