package datatypes;

public class CharVariables {
    public static void main(String[] args) {
        //Lecture: Unicode Encoding Scheme
        //this will work as a notes also
        //UniCode Range: ['\u0000', 'uffff'] or [0, 65,535], wherein former one was in hexa num, later is deci
        //Each character is encoded then stored in memory
            //Encoding is mapping each character to its binary repre.. with help of
            //an encoding scheme.
        //Java Uses the Unicode encoding scheme
            //Character to Unicode to Binary
            //Binary to Unicode to Character

        //Each number represents a character.
        //Thus, they are put in single quotes always. Being a char, not a str

        char c1 = 'A';       // 'A'
        char c2 = 65;        // 'A'
        char c3 = '\u0041';  // 'A'

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int code1 = '\u0041';
        int code2 = 'A';

        System.out.println(code1); //65, because of specified data type :)
        System.out.println(code2); //65
    }
}
