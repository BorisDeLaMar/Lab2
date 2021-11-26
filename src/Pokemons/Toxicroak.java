package Pokemons;
import Actions.*;
import ru.ifmo.se.pokemon.*;

public class Toxicroak extends Croagunk
{
	public Toxicroak(String name, int level)
	{
		super(name, level);   
		setLevel(100);
		setType(Type.POISON, Type.FIGHTING);
		setMove(new Rest(), new SteelWing(), new WorkUp(), new Peck());
		setStats(83, 106, 65, 86, 65, 85);
	}
}
