package interfaces;

public class PrintableMain 
{

	public static void main(String[] args) 
	{
		Circle c = new Circle("Red", 5);
		Rectangle s = new Rectangle("Green", 10, 20);
		Rectangle sq = new Rectangle("Blue", 5, 5);
		Image i = new Image("Desktop", "14/7/2021");
		
		Printable[] p = {c, s, sq, i};
		
		for (int j = 0; j < p.length; j++) 
		{
			p[j].print();
		}

	}

}
