import java.util.*;
public class DuplicateChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string1 = "dsa sessions";
        int count;
        char stringArray[] = string1.toCharArray();
        System.out.println("Duplicate Characters");
        for(int i=0;i<stringArray.length;i++){
            count=1;
            for (int j = i+1; j < stringArray.length; j++) {
                if(stringArray[i]==stringArray[j] && stringArray[i] != ' '){
                    count++;
                    stringArray[j] = '0';
                }
            }
            if(count>1 && stringArray[i]!='0'){
                System.out.println(stringArray[i]);
                System.out.println(count);
            
            }

            
        }
    
    }
        
    }