// Find the maximum frequency
public class s5 {
    public static void main(String[] args) {
        int freq[] = new int[256];
        String s = "oohdshfddsf";
        for(int i = 0 ; i<s.length();i++){
            char c = s.charAt(i);
            freq[c]++; 
        }
        int maxFreq = 0 ; 
        char maxChar = ' ';
        for(int i = 0 ; i<freq.length; i++)
        {
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                maxChar = (char)i;
            }
        }
        System.out.println("Character with maximum frequency: " + maxChar);
        System.out.println("Frequency: " + maxFreq);

    }
}
