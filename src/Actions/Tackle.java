package Actions;
import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {
	public Tackle()
	{
		super(Type.GRASS, 40, 100);
	}
	@Override
	protected java.lang.String describe()
	{
		return "Tackle!"+"Pam-paM";
	}
	protected void applyOppDamage(Pokemon def, double damage)
	{
		def.setMod(Stat.HP, (int)damage);
	}
}
