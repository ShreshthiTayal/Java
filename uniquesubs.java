import java.util.HashSet;

public class uniquesubs {
    public static void uniqueSubsequence(String str, int index, String newString, HashSet<String> set)
    {
        if(index == str.length())
        {
            if(set.contains(newString)){
                return;
            }
            else{
            System.out.println(newString);
            set.add(newString);
            return;
            }
        }
        char currChar= str.charAt(index);
        //take
        uniqueSubsequence(str, index+1, newString+currChar,set);
        //non take
        uniqueSubsequence(str, index+1, newString,set);
    }
    public static void main(String[] args) {
        String str="aaab";
        String newString="";
        HashSet <String> set= new HashSet<>();
        uniqueSubsequence(str, 0, newString, set);
    }
}
