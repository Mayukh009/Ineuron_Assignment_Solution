public class Program3 {
    
    
    public static void main(String [] args)
    {
        String str="iNeuron";
        String str1="Neunori";
        
        
        char [] charArray=str.toCharArray();
        char [] charArray1=str1.toCharArray();
        
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        
       if(Arrays.equals(charArray, charArray1))
       {
           System.out.println("Anagram");
       }
       else
       {
           System.out.println("Not Anagram");
       }
        
        
        
    }
    
}
