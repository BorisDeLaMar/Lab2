package Actions;
import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
	public ShadowBall()
	{
		super(Type.ELECTRIC, 80, 100);
	}
	@Override
	protected java.lang.String describe()
	{
		return "ShadowBall!"+"20% of decreasing special deffence";
	}
	protected void applyOppDamage(Pokemon def, double damage)
	{
		def.setMod(Stat.HP, (int)damage);
	}
	protected void applyOppEffects(Pokemon def)
	{
		Effect effect = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1);
		def.addEffect(effect);
	}
}
