public class removeduplicates {
    public static boolean map[]= new boolean[26];
    public static void remDuplicates(String str, String newString, int index){
        if(index==str.length())
        {
            System.out.println(newString);
            return;
        }
        char currChar= str.charAt(index);
        if(map[currChar-'a']==true)
        {
            remDuplicates(str, newString, index+1);
        }
        else{
            newString +=currChar;
            map[currChar -'a']=true;
            remDuplicates(str, newString, index+1);
        }
    }
    public static void main(String[] args) {
        String str="abacdaebd";
        String newString="";
        remDuplicates(str, newString, 0);
    }
}
