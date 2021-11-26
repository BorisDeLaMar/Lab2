package Actions;
import ru.ifmo.se.pokemon.*;

public class SteelWing extends PhysicalMove {
	public SteelWing()
	{
		super(Type.POISON, 70, 90);
	}
	@Override
	protected java.lang.String describe()
	{
		return "SteelWing!"+"That was despicably";
	}
	protected void applyOppDamage(Pokemon def, double damage)
	{
		def.setMod(Stat.HP, (int)damage);
	}
}
