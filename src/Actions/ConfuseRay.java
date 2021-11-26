package Actions;
import ru.ifmo.se.pokemon.*;

public class ConfuseRay extends StatusMove {
	public ConfuseRay()
	{
		super(Type.GHOST, 50, 100);
	}
	@Override
	protected java.lang.String describe()
	{
		return "ConfuseRay!"+"Confuse has happened";
	}
	protected void applyOppDamage(Pokemon def, double damage)
	{
		def.setMod(Stat.HP, (int)damage);
	}
}