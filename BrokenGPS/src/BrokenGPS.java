public class BrokenGPS
{
	public static void main(String[] args)
	{
		String direction = "";
		double randNum = 0;
		for(int i = 0; i < 12; i++)
			randNum = Math.random();
		System.out.println(randNum);
		if(randNum < 0.25)
		{
			direction = "North";
			System.out.println(direction);
		}
		else if (randNum >= 0.25 && (randNum < 0.5))
		{
			direction = "East";
			System.out.println(direction);
		}
		else if (randNum >= 0.5 && (randNum < 1))
		{
			direction = "South";
			System.out.println(direction);
		}
		else if (randNum >= 0.25 && (randNum < 0))
		{
			direction = "West";
			System.out.println(direction);
		}
	}
}