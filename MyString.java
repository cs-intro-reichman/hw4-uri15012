

public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String answer = ""; // initialize empty string

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                ch = (char) (ch +32);

                answer = answer + ch;

            } else if (ch >= 'a' && ch <= 'z' ||( ch == ' ')) {
                answer = answer + ch;
            }

        }


        return answer;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        
        boolean contain = false;
        int lastIndex = str1.length () - str2.length () + 1;
        for (int i = 0; i < lastIndex && !contain; i++){ // isso para quando volta o loop
            boolean match = true; // assume true until proved otherwise
                for (int j =0; j < str2.length(); j++){
                    if (str1.charAt (i + j) != str2.charAt(j)){
                        match = false;
                        break;
                    }  // entra no externo e faz pro i = 0 toda as rodadas do j ai dps p i = 1 todas as rodadas do j 
                }
                if (match) {
                    contain = true;
                }
            
            }
            return contain;
        }
    }
        
       
                    

      
      
      
      
      
        

