

package stream.operations;
import java.io.File;
import java.util.List;
import java.io.*;

public class StreamOperations {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\stream operations\\src\\stream\\operations");
        try{
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            List<String> mylines= br.lines().collect(Collectors.toList());
        }
    }
    
}
