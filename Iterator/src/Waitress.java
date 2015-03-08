/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class Waitress {
	FirstMenu firstMenu;
	SecondMenu secondMenu;
	public Waitress(FirstMenu firstMenu, SecondMenu secondMenu) {
		super();
		this.firstMenu = firstMenu;
		this.secondMenu = secondMenu;
	}
	
	public void printMenu() {
		Iterator firstIterator = firstMenu.createIterator();
		Iterator secondIterator = secondMenu.createIterator();
		
		System.out.println("MENU\n----------\nBREAKFEST");
		printMenu(firstIterator);
		System.out.println("\nLUNCH");
		printMenu(secondIterator);
	}
	
	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuPosition menuPosition = (MenuPosition)iterator.next();
			System.out.print(menuPosition.getName() + ", " + menuPosition.getPrice() + " --- ");
			System.out.println(menuPosition.getDescription());
		}
	}
}
