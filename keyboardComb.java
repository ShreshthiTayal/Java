public class keyboardComb {
    public static String[] keyboard={".","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void keyboardCombination(String str, int index, String combination){
        if(index==str.length())
        {
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(index);
        String mapping= keyboard[currChar-'0'];
        for(int i=0;i<mapping.length();i++)
        {
            keyboardCombination(str, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str= "242";
        String combination="";
        keyboardCombination(str, 0, combination);
    }
}
