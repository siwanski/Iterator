import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class FirstMenuIterator implements Iterator<Object> {

	/* (non-Javadoc)
	 * @see Iterator#hasNext()
	 */
	ArrayList<MenuPosition> list;
	int position = 0;
	
	public FirstMenuIterator(ArrayList<MenuPosition> items) {
		super();
		this.list = items;
	}

	@Override
	public boolean hasNext() {
		if(position >= list.size() || list.get(position) == null)
			return false;
		else
			return true;
	}

	/* (non-Javadoc)
	 * @see Iterator#next()
	 */
	@Override
	public Object next() {
		MenuPosition menuPosition = list.get(position);
		position += 1;
		return menuPosition;
	}
	
	@Override
	public void remove() {
		if(position <= 0) {
			throw new IllegalStateException("You're unable to delete item before first use a methode next()!");
		}
		if(list.get(position-1) != null) {
			for(int i = position-1; i < (list.size()-1); i++) {
				list.add(list.get(i+1));
			}
			list.add(null);
		}
	}
}
