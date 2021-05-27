/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

/**
 *
 * @author User
 */
public class City {
    private Integer  surface_area, population;
    private String code ,name, continent;
    
    public City(String code, String name, String continent, Integer surface_area, Integer population){
        this.code= code;
        this.name= name;
        this.surface_area= surface_area;
        this.continent= continent;
        this.population= population;     
    }

    public Integer getSurface_area() {
        return surface_area;
    }

    public void setSurface_area(int surface_area) {
        this.surface_area = surface_area;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    

    
    
}
