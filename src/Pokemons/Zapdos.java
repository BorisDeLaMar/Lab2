package Pokemons;
import Actions.*;
import ru.ifmo.se.pokemon.*;

public class Zapdos extends Pokemon
{
	public Zapdos(String name, int level)
	{
		super(name, level);   
		setLevel(100);
		setType(Type.ELECTRIC, Type.FLYING);
		setMove(new PhychoCut(), new Confusion(), new ShadowBall(), new Kinesis());
		setStats(90, 90, 85, 125, 90, 100);
	}
}
