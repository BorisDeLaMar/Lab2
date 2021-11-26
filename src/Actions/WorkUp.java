package Actions;
import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove
{
	public WorkUp()
	{
		super(Type.POISON, 0, 100);
	}
	@Override
	protected java.lang.String describe()
	{
		return "WorkUp!"+"You naughty boyzzz";
	}
	protected void applyOppDamage(Pokemon def, double damage)
	{
		def.setMod(Stat.HP, (int)damage);
	}
}
