public class City {
    private String name;
    private String country;
    private int population;

    public City(String name, String country, int population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }
    
    public City(City source) {
        setName(source.getName());
        setCountry(source.getCountry());
        setPopulation(source.getPopulation());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank.");
        }
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("Country cannot be null or blank.");
        }
        this.country = country;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        if (population <= 0) {
            throw new IllegalArgumentException("Population must be greater than 0.");
        }
        this.population = population;
    }
}