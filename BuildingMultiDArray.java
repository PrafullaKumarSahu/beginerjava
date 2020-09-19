/**
 * 
 */
package beginerjava;

/**
 * @author prafullakumarsahu
 *
 */
public class BuildingMultiDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//When elements of an array are themselves are array, that array is called multidimensional,
		// Child array do not need to have same number of elements
		int[][] grid = {
				{2, 3, 4, 5},
				{2, 6, 9},
				{8, 4, 7, 10},
				{1, 3}
		};
		
		//Accessing elements
		System.out.println(grid[2][3]);// 2nd row 3rd column of grid contains 10
		
		String[][] colorGrid= new String[2][3];
		
		System.out.println(colorGrid[0][1]); //Default value of reference is 0, reference is not having address of any value
		System.out.println(colorGrid[1][0]);
		System.out.println(colorGrid[1][1]);
		System.out.println(colorGrid[1][2]);
		
		colorGrid[0][0] = "Red";
		colorGrid[0][1] = "Green";
		colorGrid[0][2] = "Blue";
		colorGrid[1][0] = "Yellow";
		colorGrid[1][1] = "White";
		colorGrid[1][2] = "Black";
		
		System.out.println(colorGrid[0][0]);
		System.out.println(colorGrid[0][1]);
		System.out.println(colorGrid[0][2]);
		System.out.println(colorGrid[1][0]);
		System.out.println(colorGrid[1][1]);
		System.out.println(colorGrid[1][2]);
		
		for(String[] colorArray: colorGrid) {
			for (String color: colorArray) {
				System.out.println(color);
			}
		}
		
		for (int row=0; row<colorGrid.length; row++) {
			for(int col=0; col<colorGrid[row].length; col++) {
				System.out.print(colorGrid[row][col] + "\t");
			}
			System.out.println();
		}
		
		String[][] languages = new String[2][];
		String[] localLanguages = new String[4];
		String[] nativeLanguages = new String[3];
		languages[0] = localLanguages;
		languages[1] = nativeLanguages;
		
		localLanguages[0] = "Kannada";
		localLanguages[1] = "Tulu";
		localLanguages[2] = "Lambadi";
		localLanguages[3] = "Konkani";
		
		nativeLanguages[0] = "Sambalpuri";
		nativeLanguages[1] = "Katki";
		nativeLanguages[2] = "Odia";
		
		for(String[] languageArray: languages) {
			for (String language: languageArray) {
				System.out.println(language);
			}
		}
		
	}

}
