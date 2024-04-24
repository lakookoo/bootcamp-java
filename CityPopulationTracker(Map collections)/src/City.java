public class City {
    private String name;
    private String country;
    private long population;

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("City name cannot be null or blank");
        }
        this.name = name;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        if(country == null || country.isBlank()){
            throw new IllegalArgumentException("Country cannot be null or blank");
        }
        this.country = country;
    }

    public long getPopulation(){
        return population;
    }

    public void setPopulation(long population){
        if(population <= 0){
            throw new IllegalArgumentException("population cannot be null or blank");
        }
        this.population = population;
    }

    public City(String name, String country, long population) {
        setName(name);
        setCountry(country);
        setPopulation(population);
    }
    

}
