

public class App {

	public static void main(String[] args) {
		
		//Variables representing peron 1 etc.
		String firstName1 = "Frank";
		String lastName1 = "Rizzo";
		char middleInitial1 = 'B';
		double age1 = 38;
		double numOfFriends1 = 68;
		int moneyInWallet1 = 165;
		double marathon = 126.34;
		
		//Variables respresenting person 2 etc.
		String firstName2 = "Billy";
		String lastName2 = "Johnson";
		char middleInitial2 = 'J';
		double age2 = 59.0;
		double numOfFriends2 = 129.0;
		int moneyInWallet2 = 86;
		double nonFictionBook = 12.37;
		
		//Demonstrating concatenation by printing out two names including
		//a char type as the middle initial
		System.out.println(firstName1 + " " + middleInitial1 + " " + lastName1);
		System.out.println(firstName2 + " " + middleInitial2 + " " + lastName2);
		
		//Demonstrating the subtraction operation concatenation by printing
		//the amount of money that Frank has after purchasing a marathon
		System.out.println("\nAfter purchashing the marathon, " + firstName1 +" " +
		lastName1 + " has $" + (moneyInWallet1 - marathon) + " left in his wallet.");
		
		//Demonstrating the subtraction operation with concatenation by printing
		//the amount of money the Billy has after purchasing Atlas Shrugged
		System.out.println("After purchasing Atlas Shrugged, " + firstName2 + " " + 
		lastName2 + " has $" + (moneyInWallet2 - nonFictionBook) + " left in his wallet.\n");
		
		//Demonstrating the addition operation by determining how many friends
		//Billy and Frank have made per year based on their age.
		System.out.println("Based on his age, Billy has accumulated " +
		Math.round(numOfFriends1/age1 * 100.0)/100.0 + " friends per year.");
		
		System.out.println("Based on his age, Frank has accumulated " +
		Math.round(numOfFriends2/age2 * 100.0)/100.0 + " friends per year.");
		
	}

}
