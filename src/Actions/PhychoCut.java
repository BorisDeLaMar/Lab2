package Actions;
import ru.ifmo.se.pokemon.*;

public class PhychoCut extends PhysicalMove {
	public PhychoCut()
	{
		super(Type.ELECTRIC, 70, 100);
	}
	@Override
	protected java.lang.String describe()
	{
		return "PhychoCut!"+"-_-";
	}
	protected void applyOppDamage(Pokemon def, double damage)
	{
		def.setMod(Stat.HP, (int)damage);
	}
}
