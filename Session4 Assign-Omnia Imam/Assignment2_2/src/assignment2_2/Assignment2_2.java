
package assignment2_2;


public class Assignment2_2 {

    public static boolean str_type(String str){
        for(int i=0; i< str.length();i++)
        {
            if (!Character.isLetter(str.charAt(i)))
                    return false;
        }
        return true;    
    }
    
    
    public static void main(String[] args) {
        //Assignment2-2-TASK1 Run
        String st1= "Omnia Imam";
        String st2= "Comparison string";
        String longer= StringUtils.betterstring(st1, st2, (s1,s2)->s1.length()>s2.length());
        String first= StringUtils.betterstring(st1, st2, (s1,s2)->true);

        System.out.println(longer);
        System.out.println(first);
        
        //----------------------------------------------------------------------------------------------
        
        //Assignment2-2-TASK2 Run
        
        System.out.println(str_type("omnia"));
        System.out.println(str_type("Omnia373"));

    }
    
}
