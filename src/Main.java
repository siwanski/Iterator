/**
 * 
 */

/**
 * @author Szymon Iwa�ski
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Menu firstMenu = new FirstMenu();
		Menu secondMenu = new SecondMenu();
		
		Waitress waitress = new Waitress(firstMenu, secondMenu);
		waitress.printMenu();
	}

}
