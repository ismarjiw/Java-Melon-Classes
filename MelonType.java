public class MelonType {

	public static void main(String[] args) {
		System.out.println("melon type defined");
	}

    String code;
	int firstHarvest;
	String color;
	boolean isSeedless;
	boolean isBestseller;
	String name;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getFirstHarvest() {
		return this.firstHarvest;
	}

	public void setFirstHarvest(int firstHarvest) {
		this.firstHarvest = firstHarvest;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isIsSeedless() {
		return this.isSeedless;
	}

	public void setIsSeedless(boolean isSeedless) {
		this.isSeedless = isSeedless;
	}

	public boolean isIsBestseller() {
		return this.isBestseller;
	}

	public void setIsBestseller(boolean isBestseller) {
		this.isBestseller = isBestseller;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MelonType (String code,
		String name,
		int firstHarvest,
		String color,
		boolean isSeedless,
		boolean isBestseller) {

		this.code = code;
	    this.firstHarvest = firstHarvest;
	    this.color = color;
	    this.isSeedless = isSeedless;
	    this.isBestseller = isBestseller;
	    this.name = name;
	}


}
