/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class SecondMenuIterator implements Iterator {

	/* (non-Javadoc)
	 * @see Iterator#hasNezt()
	 */
	MenuPosition[] items;
	int position = 0;
	
	public SecondMenuIterator(MenuPosition[] items) {
		super();
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null)
			return false;
		else
			return true;
	}

	/* (non-Javadoc)
	 * @see Iterator#next()
	 */
	@Override
	public Object next() {
		MenuPosition menuPosition = items[position];
		position += 1;
		return menuPosition;
	}

}
