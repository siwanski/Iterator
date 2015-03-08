/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class MenuPosition {
	String name;
	String description;
	boolean vegetable;
	double price;
	
	public MenuPosition(String name, String description, boolean vegetable,
			double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetable = vegetable;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isVegetable() {
		return vegetable;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setVegetable(boolean vegetable) {
		this.vegetable = vegetable;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
