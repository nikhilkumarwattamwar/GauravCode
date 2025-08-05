package stringpractice;
//String Methods
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;

public class StringExample1 {
    public static void main(String[] args) {
        String s1 = new String("gaurav");
        String news1 = s1.concat(" sonawane");
        System.out.println(s1);
        System.out.println(news1);

        System.out.println(s1.length());

        String s2 = new String("JAVA");
        System.out.println("first charater =  " + s2.charAt(0)); //first character
        System.out.println("last character =  " + s2.charAt(s2.length()-1)); //last character
        for (int i=0; i <s2.length(); i++){
            System.out.println(s2.charAt(i));
        }

        String s3 = "SOnawANE";
        System.out.println(s3.substring(0,3));
        System.out.println(s3.toLowerCase(Locale.ROOT));
        System.out.println(s3.toUpperCase(Locale.ROOT));

        String s4 = "hello";
        String s5 = "HEllO";

        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

        System.out.println("a".compareTo("a"));
        System.out.println("a".compareTo("z"));
        System.out.println("java".contains("va"));
        System.out.println("java".contains("jaav"));

        String s6 ="Apple";
        System.out.println(s6);
        System.out.println(s6.replace('A','M'));
        System.out.println(s6.startsWith("s"));
        System.out.println(s6.startsWith("Ap"));
        System.out.println(s6.endsWith("z"));

    }
}
