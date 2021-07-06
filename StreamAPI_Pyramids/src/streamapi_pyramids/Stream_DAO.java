
package streamapi_pyramids;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Stream_DAO {
    List<Stream_Pyramid> pyramidList;

    public Stream_DAO(String fname){
        this.pyramidList= new ArrayList<Stream_Pyramid>();
        File pyramid_file = new File(fname);
    
        List<String> pyramid_lines= new ArrayList<String>();
    
        try{
            pyramid_lines= Files.readAllLines(pyramid_file.toPath());
        }
        catch(Exception e){
        System.out.println("S.ting went wrong...");
        }
    
    for(int l=0; l<pyramid_lines.size();l++){
        String[] pyramidInfo = pyramid_lines.get(l).split(",");
        pyramidList.add(new Stream_Pyramid(pyramidInfo[0],pyramidInfo[1],pyramidInfo[2],pyramidInfo[4],pyramidInfo[14],pyramidInfo[7]));
    }
    System.out.println("total number of pharoahs: "+ pyramidList.size());
}
}
