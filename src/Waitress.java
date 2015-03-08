import java.util.Iterator;

/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class Waitress {
	Menu firstMenu;
	Menu secondMenu;
	public Waitress(Menu firstMenu, Menu secondMenu) {
		super();
		this.firstMenu = firstMenu;
		this.secondMenu = secondMenu;
	}
	
	public void printMenu() {
		Iterator<?> firstIterator = (Iterator<?>) firstMenu.createIterator();
		Iterator<?> secondIterator = (Iterator<?>) secondMenu.createIterator();
		
		System.out.println("MENU\n----------\nBREAKFEST");
		printMenu(firstIterator);
		System.out.println("\nLUNCH");
		printMenu(secondIterator);
	}
	
	public void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuPosition menuPosition = (MenuPosition)iterator.next();
			System.out.print(menuPosition.getName() + ", " + menuPosition.getPrice() + " --- ");
			System.out.println(menuPosition.getDescription());
		}
	}
}
