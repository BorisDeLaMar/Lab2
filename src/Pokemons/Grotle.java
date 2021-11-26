package Pokemons;
import Actions.*;
import ru.ifmo.se.pokemon.*;

public class Grotle extends Turtwig
{
	public Grotle(String name, int level)
	{
		super(name, level);   
		setLevel(100);
		setType(Type.GRASS);
		setMove(new Confide(), new Tackle(), new Discharge());
		setStats(75, 89, 85, 55, 65, 36);
	}
}
