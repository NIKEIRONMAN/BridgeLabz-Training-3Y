import java.util.*;
public class AnagramCheck {
    static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()) return false;
        int[] f=new int[256];
        for(int i=0;i<a.length();i++){ f[a.charAt(i)]++; f[b.charAt(i)]--; }
        for(int v:f) if(v!=0) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        System.out.println(isAnagram(a,b));
    }
}
