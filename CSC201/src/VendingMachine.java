import java.util.Scanner;
public class VendingMachine
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double product = 0, inputMoney = 1, newInputMoney = 0;
		int quarters, dimes, nickels, pennies;
		int choiceNumber = 0;
		double amount = 0;
		boolean sufficient = false;

		System.out.println("This is a Vending Machine.\n"
				+ "Please enter the amount of cash you would like to spend.\n"
				+ "No $10 dollar bills or more are allowed.\n"
				+ "Only $5, $1, $0.25, $0.10, $0.05, $0.01");

		inputMoney = scan.nextDouble();
		while (sufficient != true)
		{
			//while loop for entering money, press 0 to end entering money.
			while (inputMoney!=0)
			{
				while (inputMoney>0 && inputMoney<10)
				{
					if (inputMoney==5)
					{
						System.out.println("You've entered 5 dollars");
						amount=5;
					}
					else if (inputMoney==1)
					{
						System.out.println("You've entered 1 dollar");
						amount=1;
					}
					else if(inputMoney==.25)
					{
						System.out.println("You've entered a quarter");
						amount=.25;
					}
					else if (inputMoney==.10)
					{
						System.out.println("You've entered a dime");
						amount=.10;
					}
					else if (inputMoney==.05)
					{
						System.out.println("You've entered a nickel");
						amount=.05;
					}
					else if (inputMoney==.01)
					{
						System.out.println("You've entered a penny");
						amount=.01;
					}
					else 
					{
						System.out.println("Machine does not accept that amount. Try again.\n"
								+ "This machine ONLY accepts $5 or $1 bills, quarters, dimes, nickels or pennies.");
						amount=0;
						inputMoney = scan.nextDouble();
					}
					//will repeat and add money as needed
					newInputMoney=newInputMoney+amount;
					System.out.println("Total money entered -- $"+ newInputMoney);
					System.out.println("Enter more money or Enter 0 to end money entering.");
					inputMoney = scan.nextDouble();

				}
				if (inputMoney>=10)
				{
					System.out.println("Machine does not accept $10 dollars or more bills. Try again.");	
					inputMoney = scan.nextDouble();
				}
			}

			//if money ins't enough, put more money in! outside inner while loop (money!=0).
			if (newInputMoney>=product)
			{
				System.out.println("You have sufficient amount of money entered for your item!\n");

			}
			else 
			{
				System.out.println("You have an insufficient amount of money entered for your item. Enter more money.\n");
				inputMoney = scan.nextDouble();
			}
			sufficient = true;
		}
		printMenu();
		while(choiceNumber != 6)
		{
			choiceNumber = readChoiceNumber();
			switch(choiceNumber)

			{
			case 1:
				System.out.println("You selected Coke $1.50 cents");
				product = 1.50;
				break;
			case 2:
				System.out.println("You selected Hot Pockets $4.25 cents");
				product = 4.25;
				break;
			case 3:
				System.out.println("You selected Sprite $1.35 cents");
				product = 1.35;
				break;
			case 4:
				System.out.println("You selected Dr. Pepper $2.00 cents");
				product = 2.00;
				break;
			case 5:
				System.out.println("You selected Mountain Dew $1.25 cents");
				product = 1.25;
				break;
			}
			System.out.println("You entered: " + newInputMoney);
			amount = (newInputMoney - product);

			System.out.println("Your change is: " + amount + "dollar/cents");
			System.out.println(amount + " dollar/cents in coins can be given as: ");

			quarters = (int) (amount/.25);
			amount = amount % .25;
			dimes = (int) (amount/.10);
			amount = amount % .10;
			nickels = (int) (amount/.05);
			amount = amount % .05;
			pennies = (int) amount;

			System.out.println(quarters + " quarter(s)");
			System.out.println(dimes + " dime(s)");
			System.out.println(nickels + " nickel(s) and");
			System.out.println(pennies + " pennies");
			System.out.println("Enjoy your purchase!");
			break;
		}
	}
	private static void printMenu()
	{
		System.out.println("VENDING MACHINE");
		System.out.println("Coke $1.50 Press [1]");
		System.out.println("Hot Pockets $4.25 cents Press [2]");
		System.out.println("Sprite $1.35 cents Press [3]");
		System.out.println("Dr. Pepper $2.00 cents Press [4]");
		System.out.println("Mountain Dew $1.25 cents Press [5]");
		System.out.println("Please enter the number of your choice.");
	}
	private static int readChoiceNumber()
	{
		Scanner scan = new Scanner(System.in);
		int choiceNumber;
		String indent = "                   ";
		choiceNumber = scan.nextInt();
		while(choiceNumber < 1 || choiceNumber > 5)
		{
			System.out.println(indent + "the number must be 1 through 6 inclusive");
			System.out.println(indent + "    please enter a proper choice.  ");
			choiceNumber = scan.nextInt();
		}
		return choiceNumber;
	}
}
