
package streamapi_pyramids;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamAPI_Pyramids {

    public static void main(String[] args) {
          
        Stream_DAO dao = new Stream_DAO("C:\\Users\\User\\Documents\\NetBeansProjects\\stream operations\\build\\classes\\stream\\operations\\pyramids.csv");
        ArrayList<Stream_Pyramid> pyramids = (ArrayList<Stream_Pyramid>) dao.pyramidList;
        ArrayList<Stream_Pyramid> sortedPyramids;
        //Sorting to be able to calculate median
        sortedPyramids =pyramids.stream().filter(p -> p.getHeight()!=0).sorted((s1,s2)->s1.getHeight().compareTo(s2.getHeight())).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(sortedPyramids);
        Stream_Pyramid median;        
        median = pyramids.stream().filter(p -> p.getHeight()!=0).sorted(Comparator.comparing(Stream_Pyramid::getHeight)).collect(Collectors.toCollection(ArrayList::new)).get((pyramids.size())/2-1);
        System.out.println("Median: "+median);
        
        //---------------------------------------------------------------------------
        
        Stream_Pyramid lowerQuart;
        Stream_Pyramid upperQuart;

        lowerQuart= pyramids.stream().filter(p -> p.getHeight()!=0).sorted(Comparator.comparing(Stream_Pyramid::getHeight)).collect(Collectors.toCollection(ArrayList::new)).get(pyramids.size()/4);
        upperQuart= pyramids.stream().filter(p -> p.getHeight()!=0).sorted(Comparator.comparing(Stream_Pyramid::getHeight)).collect(Collectors.toCollection(ArrayList::new)).get(pyramids.size()*3/4);
        
        System.out.println("Lower quartile: "+lowerQuart);
        System.out.println("Upper quartile: "+upperQuart);
        
        //---------------------------------------------------------------------------
        
        double avg= sortedPyramids.stream().mapToDouble(pyramid->pyramid.getHeight()).average().getAsDouble();
        System.out.println("average: "+avg);
        

        
    
    }
    
}
