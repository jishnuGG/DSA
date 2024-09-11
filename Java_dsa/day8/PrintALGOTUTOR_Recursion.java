public class PrintALGOTUTOR_Recursion {
    public static void print(String s,int index)
    {
        if(index==s.length())
        {
            return;
        }
        System.out.println(s.charAt(index));
        print(s, index+1);
    }
    public static void main(String[] args) {
        String s="ALGOTUTOR";
        int i=0;
        print(s,i);
        
    }
}
