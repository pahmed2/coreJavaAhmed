package homeWork4;

import java.util.Stack;
import java.util.StringTokenizer;

public class StringManipulation {

    public static void main(String[] args) {
        String st = "My name is Payer Ahmed, I like programming";

        //Using basic methods
        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());
        System.out.println(st.indexOf('P'));
        System.out.println(st.indexOf(2));
        System.out.println(st.charAt(4));
        System.out.println(st.trim());
        System.out.println(st.codePointAt(5));
        System.out.println(st.codePointBefore(5));
        System.out.println(st.concat("Hello"));
        System.out.println(st.codePointCount(2, 8));
        System.out.println(st.compareTo("Welcome to pnt"));

        // compareTo
        String name1="Payer";
        String name2="Ahmed";
        int result = name1.compareTo(name2);
        if (result == 0) {
            System.out.println("The names are equal.");
        }
        else if (result > 0) {
            System.out.println("name2 comes before name1 alphabetically.");
        }
        else if (result < 0) {
            System.out.println("name1 comes before name2 alphabetically.");
        }

        //Searching For and Retrieving Substrings
        String string1 = "My address is 210 Hillside Ave, NY";
        String address = string1.substring(14);
        System.out.println(address);

        //Reversing a String by Character
        String letters = "ABCDEFGHIJKLMN";
        StringBuffer lettersBuff = new StringBuffer(letters);
        String lettersRev =
                lettersBuff.reverse().toString();
        System.out.println(lettersRev);

        //Reversing a String by Word
        String test = "Reverse this string";
        Stack  stack = new Stack();
        StringTokenizer strTok = new StringTokenizer(test);
        while(strTok.hasMoreTokens()) {
            stack.push(strTok.nextElement());
        }
        StringBuffer revStr = new StringBuffer();
        while(!stack.empty()) {
            revStr.append(stack.pop());
            revStr.append(" ");
        }
        System.out.println("Original string: " + test);
        System.out.println("\nReversed string: " + revStr);

        System.out.println("\n I can do more string manipulation.....");


    }
}
