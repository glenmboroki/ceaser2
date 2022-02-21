import java.util.Scanner;

public class ceaserdecrypt {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("  qeb nrfzh yoltk clu grjmp lsbo qeb ixwv ald: ");
            String ciphertext = sc.nextLine();
            System.out.println(" -2 : ");
            int shift = sc.nextInt();
            String decryptMessage = "";
            for (int i = 0; i < ciphertext.length(); i++) {
                char alphabet = ciphertext.charAt(i);
                if (alphabet >= 'a' && alphabet <= 'z') {
                    alphabet = (char) (alphabet - shift);

                    if (alphabet < 'a') {
                        alphabet = (char) (alphabet - 'a' + 'z' + 1);
                    }
                    decryptMessage = decryptMessage + alphabet;
                }
                else if (alphabet >= 'A' && alphabet <= 'Z') {
                    alphabet = (char) (alphabet - shift);

                    if (alphabet < 'A') {
                        alphabet = (char) (alphabet - 'A' + 'Z' + 1);
                    }
                    decryptMessage = decryptMessage + alphabet;
                } else {
                    decryptMessage = decryptMessage + alphabet;
                }
            }
            System.out.println(" qeb nrfzh yoltk clu grjmp lsbo qeb ixwv ald: " + decryptMessage);
        }
    }

