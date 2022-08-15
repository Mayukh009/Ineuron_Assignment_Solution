public class Program5 {
    
    
    public static void main(String [] args)
    {
        String str="ineuron";
        char [] charArray=str.toCharArray();
        Arrays.sort(charArray);
        int count=0;
        char ch='a';
        
        
        
        
        for(int i=0;i<charArray.length;i++)
        {
            if(i!=charArray.length-1)
            {
            if(charArray[i]==charArray[i+1])
            {
                count=count+1;   
                ch=charArray[i];
             
                continue;
                
            }
            if(count>0)
            {
                System.out.println(ch);
                count=0;
            }
            }
            
                
        }
    }
    
}
