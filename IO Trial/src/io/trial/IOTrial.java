
package io.trial;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class IOTrial {

    public static void main(String[] args) throws Exception {
        try{
            
        File file = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\stream operations\\build\\classes\\stream\\operations\\pyramids.csv");
        System.out.println(file.getAbsolutePath());
        }
        catch (Exception e){
            System.out.println("There's an issue in executing this operation");
        }
//        String [] fileList = file.list();
//        for(String i: fileList)
//            System.out.println(i);                  <<<DIDN'T WORK!!!>>>      
//--------------------------------------------------------------------------------------------------------------

        try{
            
        File file2 = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\IO Trial\\build\\classes\\io\\trial\\created_file.txt");
        
            if(file2.createNewFile())
            {
                System.out.println("Done");
            }  
            else
                System.out.println("Exists");
            
            FileWriter myWriter = new FileWriter("created_file.txt");
            myWriter.write("Hello, this is my trial to write on a new created file..!");
            System.out.println("File has successfully been written on..");
            myWriter.close();

        }catch(Exception e){
            System.out.println("s.thing went wrong..");
            e.printStackTrace();
        }
        
        //----------------------------------------
        try{
            File f = new File("created_file.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String data= sc.nextLine();
                System.out.println(data);
            }
        sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    private static void close(File file2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
