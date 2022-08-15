public class Program7 {
    
    
   public static void main(String [] args)
   {
       
       
       String str="iNeuron";
       int vowel=0;
       int consonent=0;
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u' )
           {
               vowel=vowel+1;
           }
           else
           {
               consonent=consonent+1;
           }
       }
       System.out.println("Number of Vowel "+vowel+" Number of Consonent "+consonent);
       
       
       
   }
    
}
