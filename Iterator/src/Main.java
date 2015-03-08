/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirstMenu firstMenu = new FirstMenu();
		SecondMenu secondMenu = new SecondMenu();
		
		Waitress waitress = new Waitress(firstMenu, secondMenu);
		waitress.printMenu();
	}

}
