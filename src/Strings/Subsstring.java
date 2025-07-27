package Strings;

public class Subsstring {
    static void printsSubstring(String r){
        int n = r.length();
        for(int i=0; i<n; i++){
            for(int j = i+1; j<=n; j++){
                System.out.println(r.substring(i,j));
            }
        }

    }


    public static void main(String[] args) {
        String s = "abcabcbb";

        printsSubstring(s);
    }
}
