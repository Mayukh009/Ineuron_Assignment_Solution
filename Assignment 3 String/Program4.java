public class Program4 {
    
    
     public static void main(String [] args)
     {
         String str="abcdefghijklmnopqrstuvwxyz";
         String str1="abcdefghijklmnopqrstuvwxyzfbddghjgfhjbvjjbffghj";
         String charString="Pangram";
         
         
       
         for(int i=0;i<str.length();i++)
         {
             if(str1.contains(Character.toString(str.charAt(i))))
             {
                 continue;
             }
             charString="Not Pangram";
         }
         
         System.out.println(charString);
             
        
             
         
     }
    
}
