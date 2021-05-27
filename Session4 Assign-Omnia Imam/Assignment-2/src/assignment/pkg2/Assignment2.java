
package assignment.pkg2;

import java.io.File;
import java.util.List;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


class Comp implements Comparator<City>{

    @Override
    public int compare(City o1, City o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return o1.getPopulation().compareTo(o2.getPopulation());
                }  
}
public class Assignment2 {
    
    public static List<City> sort(List<City> new_cityList){
        new_cityList.sort(new Comp());
        return new_cityList;
    }
    
    public static void main(String[] args) {
        
        File Countries_file=new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Session4 Assign-Omnia Imam\\Assignment-2\\build\\classes\\assignment\\pkg2\\countries.csv");
       
        File Cities_file= new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Session4 Assign-Omnia Imam\\Assignment-2\\build\\classes\\assignment\\pkg2\\cities.csv");
        
        
        List<String> Country_records = new ArrayList<>();
        List<String> City_records = new ArrayList<>();
        
        try{
            Country_records = Files.readAllLines(Countries_file.toPath());
            
            //System.out.println("countries:"+Country_records.size());
            City_records = Files.readAllLines(Cities_file.toPath());
            
//            System.out.println("cities:"+City_records.size());

        }catch(Exception e){
            System.out.println("An Issue has happend during reading files.."+ e);  }
        
       
        List<Country> countryList = new ArrayList<Country>();
        List<City> cityList = new ArrayList<City>();
        Map<String,List<City>> country_city_map = new HashMap<>();

        
        for (int i=0; i<Country_records.size(); i++){
            String[] countryInfo = Country_records.get(i).split(",");
//            System.out.println(info[1]);
             countryList.add(new Country(countryInfo[0],countryInfo[1])); 
             country_city_map.put(countryInfo[0], new ArrayList<>());
        }
        
         for (int i=0; i<City_records.size(); i++){
            String[] city_info = City_records.get(i).split(",");
            cityList.add(new City(city_info[0],city_info[1],city_info[2],Integer.parseInt(city_info[3]), Integer.parseInt(city_info[4])));
            List<City> L = country_city_map.get(city_info[0]);
            L.add(cityList.get(i));
            country_city_map.put(city_info[0],L);
        }
         
       for(int i=0; i<country_city_map.get("111").size();i++){
           System.out.println(country_city_map.get("111").get(i).getName());
           System.out.println(country_city_map.get("111").get(i).getPopulation());}
       
       List<City> sorted_list= sort(country_city_map.get("111"));
       
       System.out.println("\n--------------------------------------------\n");
       
       for(int i=0; i<sorted_list.size();i++){
            System.out.println(sorted_list.get(i).getName());
            System.out.println(sorted_list.get(i).getPopulation());}


    }
    
}
