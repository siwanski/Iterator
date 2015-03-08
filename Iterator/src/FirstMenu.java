import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class FirstMenu {
	ArrayList<MenuPosition> menuPositions;
	
	public FirstMenu() {
		menuPositions = new ArrayList<MenuPosition>();
		
		addItem("Classic pancake Premium", "Egg and toast", true, 2.99);
		addItem("Classic pancake", "Egg and beef", false, 2.99);
		addItem("Fruit pancake", "Strawberry", true, 3.49);
		addItem("Starters", "Bread", true, 0.89);
	}
	
	public void addItem(String name, String description, boolean vegetable, double price) {
		MenuPosition menuPosition = new MenuPosition(name, description, vegetable, price);
		menuPositions.add(menuPosition);
	}

	public ArrayList<MenuPosition> getMenuPositions() {
		return menuPositions;
	}

	//unused method, because Iterator working
	/*public void setMenuPositions(ArrayList<MenuPosition> menuPositions) {
		this.menuPositions = menuPositions;
	}*/
	
	public Iterator createIterator() {
		return new FirstMenuIterator(menuPositions);
	}
}
