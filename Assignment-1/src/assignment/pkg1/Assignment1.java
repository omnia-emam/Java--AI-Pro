
package assignment.pkg1;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Assignment1 {

 
    public static void main(String[] args) {
//        List <String> pyramid_records = new ArrayList<>();
//        try{
//            File pyramid_file = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\stream operations\\build\\classes\\stream\\operations\\pyramids.csv");  
//            pyramid_records = Files.readAllLines(pyramid_file.toPath());
//        //  for(int line=0; line<pyramid_records.size();line++){
//               // System.out.println(pyramid_records.get(line));}
//            }catch(Exception e){
//            System.out.println("An error occured");
//            e.printStackTrace(); }
//        
//        
//        List<Pyramids> pyramidList = new ArrayList<Pyramids>();
//        for (int i=0; i<pyramid_records.size(); i++){
////           System.out.println(pyramid_records.get(i)); 
//             String[] pyramidInfo = pyramid_records.get(i).split(",");
//             pyramidList.add(new Pyramids(pyramidInfo[0],pyramidInfo[1],pyramidInfo[2],pyramidInfo[4],pyramidInfo[14])); 

           PyramidsDAO dao = new PyramidsDAO("C:\\Users\\User\\Documents\\NetBeansProjects\\stream operations\\build\\classes\\stream\\operations\\pyramids.csv");
    }
  }
