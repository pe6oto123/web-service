package st.soa;

public class City {

	private String name;
	private int population;
	private boolean isCapital;
	
	public City(String name, int population, boolean isCapital) {
		super();
		this.name = name;
		this.population = population;
		this.isCapital = isCapital;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public boolean isCapital() {
		return isCapital;
	}
	
}
