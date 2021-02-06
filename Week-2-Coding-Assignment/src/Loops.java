
public class Loops {

	public static void main(String[] args) {
		
		//While loop that prints all even numbers from 0 to 100
		int i = 0;
		while (i <= 50) {
			System.out.println(i * 2);
			i++;
						}
		
		//While loop that prints every 3rd number going backwards from 100 until we reach 0
		int x = 100;
		while (x>=0) {
			System.out.println(x);
			x = (x-3);
					 }
		
		//Loop that prints every other number from 1 to 100
		for (int y = 1; y <= 100; y = (y + 2) ) {
			System.out.println(y);
												}
		//Loop that prints every number from 0 to 100 w/ special printing conditions divisible by 3,5 and 3&&5
		for (int z = 0; z <= 100; z++) {
			if (z%3 == 0 && z%5!=0 && z!=0) {
				System.out.println("Hello");
											}
				else if (z%5 == 0 && z%3!=0 && z!=0) {
					System.out.println("World");
													 }
					else if (z%3==0 && z%5==0 && z!=0) {
						System.out.println("Hello World");
													   }
			else {
			
			System.out.println(z);
				 }
									    }			
										   }
				  }