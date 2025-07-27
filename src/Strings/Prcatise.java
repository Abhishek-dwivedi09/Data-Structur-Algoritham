package Strings;
import java.util.*;
public class Prcatise {
    public static void main(String[] args) {
        String s[] = {"flower","flight","flow"};
        for(String str:s) {
            System.out.println("origional string"+" "+ str);
        }
        Arrays.sort(s);
         for(String str:s) {
             System.out.println(str);
         }



    }
}
