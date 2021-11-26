package Pokemons;
import Actions.*;
import ru.ifmo.se.pokemon.*;

public class Turtwig extends Pokemon
{
	public Turtwig(String name, int level)
	{
		super(name, level);   
		setLevel(100);
		setType(Type.GRASS);
		setMove(new Confide(), new Tackle());
		setStats(55, 68, 64, 45, 55, 31);
	}
}
