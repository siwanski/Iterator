

/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class SecondMenu {
	static final int MAX_NUMBER_OF_ITEMS = 6;
	int itemNumbers = 0;
	MenuPosition[] menuPositions;
	
	public SecondMenu() {
		menuPositions = new MenuPosition[MAX_NUMBER_OF_ITEMS];
		
		addItem("Vegetable sandwith", "Bread, tomatoe, vegetable beef", true, 2.99);
		addItem("Sandwith PREMIUM", "Bread, tomatoe, sallad", false, 2.99);
		addItem("Tomatoe sallad", "Tomatoe, sallad, oil", true, 3.49);
		addItem("Hot-Dog", "cheese, onion, bread, meat", true, 1.89);
	}
	
	public void addItem(String name, String description, boolean vegetable, double price) {
		MenuPosition menuPosition = new MenuPosition(name, description, vegetable, price);
		if(itemNumbers >= MAX_NUMBER_OF_ITEMS) {
			System.err.println("Too many items in menu!");
		}
		else {
			menuPositions[itemNumbers] = menuPosition;
			itemNumbers += 1;
		}
	}

	public MenuPosition[] getMenuPositions() {
		return menuPositions;
	}

	//unused method, because Iterator working
	/*public void setMenuPositions(MenuPosition[] menuPositions) {
		this.menuPositions = menuPositions;
	}*/
	
	public Iterator createIterator() {
		return new SecondMenuIterator(menuPositions);
	}
}
