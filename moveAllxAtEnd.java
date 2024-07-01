public class moveAllxAtEnd{
    public static void moveXAtEnd(String str, int index, String newStr, int count)
    {
        if(index==str.length())
        {
            for(int i=0;i<count;i++)
            {
                newStr+='x';
            }
            System.out.println(newStr);
            
            return;
        }
        char currChar= str.charAt(index);
        if(currChar=='x')
        {
            count++;
            moveXAtEnd(str, index+1, newStr, count);
        }
        else{
            newStr+=currChar;
            moveXAtEnd(str, index+1, newStr, count);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxdxe";
        String newStr="";
        moveXAtEnd(str, 0, newStr, 0);
    }
}