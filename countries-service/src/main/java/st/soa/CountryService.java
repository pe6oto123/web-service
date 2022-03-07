package st.soa;

public class CountryService {
	
	private static Country[] countries = {
		new Country("Bulgaria", "Europe", "Bulgarian", new City[]{
			new City("Sofia", 1236153, true),
			new City("Plovdiv", 343424, false)
		}),
		new Country("Australia", "Oceania", "English", new City[] {
			new City("Canberra", 426845, true),
			new City("Newcastle", 453515, false)
		})
	};
	
	public City[] getCitiesByCountryName(String name) throws CountryNotFoundException{
		for (Country country : countries) {
			if(country.getName().equals(name)) {
				return country.getCities();
			}
		}
		
		throw new CountryNotFoundException("");
	}
	
	public Country[] getAllCountries() {
		return countries;
	}
}
