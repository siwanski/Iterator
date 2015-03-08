import java.util.Iterator;
/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class SecondMenuIterator implements Iterator<Object> {

	/* (non-Javadoc)
	 * @see Iterator#hasNext()
	 */
	MenuPosition[] list;
	int position = 0;
	
	public SecondMenuIterator(MenuPosition[] items) {
		super();
		this.list = items;
	}

	@Override
	public boolean hasNext() {
		if(position >= list.length || list[position] == null)
			return false;
		else
			return true;
	}

	/* (non-Javadoc)
	 * @see Iterator#next()
	 */
	@Override
	public Object next() {
		MenuPosition menuPosition = list[position];
		position += 1;
		return menuPosition;
	}
	
	@Override
	public void remove() {
		if(position <= 0) {
			throw new IllegalStateException("You're unable to delete item before first use a methode next()!");
		}
		if(list[position-1] != null) {
			for(int i=position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}
}
