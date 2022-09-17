package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] city = new String[3][3];
		city[0][0] = "Ýstanbul";
		city[0][1] = "Ankara";
		city[0][2] = "Antalya";
		city[1][0] = "Adana";
		city[1][1] = "Ýzmir";
		city[1][2] = "Rize";
		city[2][0] = "Gaziantep";
		city[2][1] = "Mersin";
		city[2][2] = "Sivas";

		for (int i = 0; i < city.length; i++) {
			for (int j = 0; j < city.length; j++) {
				System.out.print(city[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
