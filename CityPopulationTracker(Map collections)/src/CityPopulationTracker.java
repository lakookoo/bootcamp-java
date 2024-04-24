import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulations;

    public CityPopulationTracker(){
        cityPopulations = new HashMap<>();
    }

    public City getCity(String name){
        return new City(cityPopulations.get(name));
    }

    public void setCity(City city){
        cityPopulations.put(city.getName(), new City(city));
    }

    public void addCity(City city){
        cityPopulations.put(city.getName(), new City(city));
    }
}
