// Character Freq : 
public class a23 {
    public static void main(String[] args) {
        char[] Character = {'a', 'b', 'c', 'a', 'd', 'e', 'b', 'f', 'g', 'c'};
        int freq [] = new int[256];

        for(char ch : Character){
            freq[ch]++;
        }
        System.out.println("Frequecy of character : ");
        for(int i = 0 ; i < 256 ; i++){
            if(freq[i] > 0){
                System.out.println("Character '" + (char) i + "': " + freq[i]);
            }
        }
    }
}
