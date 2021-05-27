
package assignment2_2;


interface StringForm{
    boolean check(String st1, String st2);
}


public class StringUtils{
      public static String betterstring(String s1, String s2, StringForm comp){
                if(comp.check(s1,s2))   
                    return s1;
                else
                    return s2;
 }   
}

