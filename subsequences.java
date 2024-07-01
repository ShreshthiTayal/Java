public class subsequences {
    public static void subsequence(String str, int index, String newString)
    {
        if(index == str.length())
        {
            System.out.println(newString);
            return;
        }
        char currChar= str.charAt(index);
        //take
        subsequence(str, index+1, newString+currChar);
        //non take
        subsequence(str, index+1, newString);
    }
    public static void main(String[] args) {
        String str="abcd";
        String newString="";
        subsequence(str, 0, newString);
    }
}
