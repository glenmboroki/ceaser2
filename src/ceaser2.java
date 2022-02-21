import java.util.Scanner;

public class ceaser2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" the quick brown fox jumps over the lazy dog: ");
        String plaintext = sc.nextLine();
        System.out.println( "2");
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++)
        {
            alphabet = plaintext.charAt(i);

            if(alphabet >= 'a' && alphabet <= 'z')
            {
                alphabet = (char) (alphabet + shift);
                if(alphabet > 'z') {
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }

            else if(alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shift);

                if(alphabet > 'Z') {
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else {
                ciphertext = ciphertext + alphabet;
            }

        }
        System.out.println(" he quick brown fox jumps over the lazy dog: " + ciphertext);
    }

}





