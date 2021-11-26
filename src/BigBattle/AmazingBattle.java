package BigBattle;
import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class AmazingBattle{
	public static void main(String[] args)
	{
		Battle b = new Battle();
		Croagunk p1 = new Croagunk("Vovamas", 100);
		Grotle p2 = new Grotle("Rock", 100);
		Torterra p3 = new Torterra("Vanomas", 100);
		Toxicroak p4 = new Toxicroak("John Cena", 100);
		Turtwig p5 = new Turtwig("Young Goblino", 100);
		Zapdos p6 = new Zapdos("Solek", 100);
		b.addAlly(p1);
		b.addAlly(p2);
		b.addAlly(p3);
		b.addFoe(p4);
		b.addFoe(p5);
		b.addFoe(p6);
		b.go();
	}
}

