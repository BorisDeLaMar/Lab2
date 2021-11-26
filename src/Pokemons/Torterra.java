package Pokemons;
import Actions.*;
import ru.ifmo.se.pokemon.*;

public class Torterra extends Grotle
{
	public Torterra(String name, int level)
	{
		super(name, level);   
		setLevel(100);
		setType(Type.GRASS, Type.GROUND);
		setMove(new Confide(), new Tackle(), new Discharge(), new ConfuseRay());
		setStats(95, 109, 105, 75, 85, 56);
	}
}
