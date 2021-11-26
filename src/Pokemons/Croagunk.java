package Pokemons;
import Actions.*;
import ru.ifmo.se.pokemon.*;

public class Croagunk extends Pokemon
{
	public Croagunk(String name, int level)
	{
		super(name, level);   
		setLevel(100);
		setType(Type.POISON, Type.FIGHTING);
		setMove(new Rest(), new SteelWing(), new WorkUp());
		setStats(48, 61, 40, 61, 40, 50);
	}
}
