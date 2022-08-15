public class Program8 {
    
    
     public static void main(String [] args)
     {
              
         int count=0;
         
         String str="@iNeuron";
         
         for(int i=0;i<str.length();i++)
         {
             
             int j=str.charAt(i);
             if((j>=32 && j<=47)||(j>=58 && j<=64)||(j>=91 && j<=96)||(j>=123 && j<=126))
             {
                 count=count+1;
             }
         }
         
         System.out.println(count);
         
         
         
         
         
     }
    
}
