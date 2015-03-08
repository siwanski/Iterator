import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class FirstMenuIterator implements Iterator {

	/* (non-Javadoc)
	 * @see Iterator#hasNext()
	 */
	ArrayList<MenuPosition> items;
	int position = 0;
	
	public FirstMenuIterator(ArrayList<MenuPosition> items) {
		super();
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(position >= items.size() || items.get(position) == null)
			return false;
		else
			return true;
	}

	/* (non-Javadoc)
	 * @see Iterator#next()
	 */
	@Override
	public Object next() {
		MenuPosition menuPosition = items.get(position);
		position += 1;
		return menuPosition;
	}

}
