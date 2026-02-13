import java.util.Scanner;
public class CountWordsinSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        System.out.print("Enter a sentence to count no. of words: ");
        s = sc.nextLine();
        int c = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == ' ' || s.charAt(i) == '\n'){
                c++;
            }
        }
        System.out.println("number of words in given sentence: "+c);

    }
}
