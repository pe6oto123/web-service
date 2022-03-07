package st.soa;

public class Country {

	private String name;
	private String continent;
	private String language;
	private City[] cities;

	public Country(String name, String continent, String language, City[] cities) {
		super();
		this.name = name;
		this.continent = continent;
		this.cities = cities;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public String getContinent() {
		return continent;
	}

	public City[] getCities() {
		return cities;
	}

	public String getLanguage() {
		return language;
	}

}
