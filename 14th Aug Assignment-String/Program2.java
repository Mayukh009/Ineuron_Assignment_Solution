public class Program2 {
    
    
    public static void main(String [] args)
    {
        String str="Think Twice";
        String []strArray=str.split(" ");
        
        
        String str1="";
        
        for(int i=0;i<strArray.length;i++)
        {
            
            for(int j=strArray[i].length()-1;j>=0;j--)
            {
                str1=str1+strArray[i].charAt(j);
                
                
            }
            if(!(i==strArray.length-1))
            {
                str1=str1+" ";
            }
            
            
            
        }
        
        System.out.println(str1);
    }
    
}
