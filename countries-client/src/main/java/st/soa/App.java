package st.soa;

import java.rmi.RemoteException;

import st.soa.CountryServiceStub.City;
import st.soa.CountryServiceStub.Country;
import st.soa.CountryServiceStub.GetAllCountries;
import st.soa.CountryServiceStub.GetAllCountriesResponse;
import st.soa.CountryServiceStub.GetCitiesByCountryName;
import st.soa.CountryServiceStub.GetCitiesByCountryNameResponse;

public class App {

    public static void main(String[] args) throws RemoteException, CountryServiceCountryNotFoundExceptionException {
	CountryServiceStub stub = new CountryServiceStub(
		"http://localhost:8080/countries-service/services/CountryService.CountryServiceHttpSoap12Endpoint/");

	GetAllCountries countries = new GetAllCountries();
	GetCitiesByCountryName cities = new GetCitiesByCountryName();

	cities.setName("Bulgaria");

	GetAllCountriesResponse resCountries = stub.getAllCountries(countries);
	printCountries(resCountries.get_return());

	System.out.println("----------------------------\n\n");

	GetCitiesByCountryNameResponse resCities = stub.getCitiesByCountryName(cities);
	printCities(resCities.get_return());
    }

    private static void printCountries(Country[] countries) {
	for (Country country : countries) {
	    System.out.println("Country name: " + country.getName());
	    System.out.println("Located in: " + country.getContinent());
	    System.out.println("Language: " + country.getLanguage() + "\n");
	    for (City city : country.getCities()) {
		System.out.println("City name: " + city.getName());
		System.out.println("City population: " + city.getPopulation() + " people");
		System.out.println("City " + (city.getCapital() ? "is" : "is not") + " a capital\n");
	    }
	    System.out.println();
	}
    }

    private static void printCities(City[] cities) {
	for (City city : cities) {
	    System.out.println("City name: " + city.getName());
	    System.out.println("City population: " + city.getPopulation() + " people");
	    System.out.println("City " + (city.getCapital() ? "is" : "is not") + " a capital");
	}
    }
}
