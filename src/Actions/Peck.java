package Actions;
import ru.ifmo.se.pokemon.*;

public class Peck extends PhysicalMove {
	public Peck()
	{
		super(Type.POISON, 35, 100);
	}
	@Override
	protected java.lang.String describe()
	{
		return "Peck!"+"That's a PAK";
	}
	protected void applyOppDamage(Pokemon def, double damage)
	{
		def.setMod(Stat.HP, (int)damage);
	}
}
