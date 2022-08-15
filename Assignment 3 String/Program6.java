public class Program6 {
    
    
    public static void main(String [] args)
    {
        String str="ineuron";
        
        
        String str1="";
                
                
        
        char [] charArray=str.toCharArray();
        Arrays.sort(charArray);
        for(int i=0;i<charArray.length;i++)
        {
            str1=str1+charArray[i];
        }
        
        System.out.println(str1);
        
        
    }
    
}
