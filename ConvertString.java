// Problem Statement
// You are given a string 'STR'. You have to convert the first alphabet of each word in a string to UPPER CASE.
// For example:
// If the given string 'STR' = ”I am a student of the third year” so you have to transform this string to ”I Am A Student Of The Third Year"


public class ConvertString{
	public static void main(String args[]){
            // Write your code here
            
        char ch;
        String s = "I love programming";
        String res=""; 
        ch = s.charAt(0); 
        ch = Character.toUpperCase(s.charAt(0));
        res +=ch;
        
        for(int i=1;i<s.length();i++){
                if(s.charAt(i-1) == ' '){
                    System.out.println(s.charAt(i-1)==' ');
                    System.out.println(i);
                    
                    ch = Character.toUpperCase(s.charAt(i));
                    
                    res+=ch;
              
                    //System.out.println(res);
                }else {
                    
                    res+=s.charAt(i);
                   // System.out.println(res);
                }
        }
        System.out.println(res);
        
        //return res;
        }

}
