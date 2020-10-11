package p1;

public class ArrayGame {

	public static void main(String[] args) {
		System.out.println(gameWithCells(2, 2));

	}

	public static int gameWithCells(int n, int m) {
		// we used the concept that we use the four block for min steps
		// for that purpose we take two from row and two from column
		return (++m / 2) * (++n / 2);
	}

}
