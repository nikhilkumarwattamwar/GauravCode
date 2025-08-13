package stringpractice;

public class StringCompare {
    public static void main (String[] args) {
        String s1 = "gaurav";
        String s2 = "gaurav";
        String s3 = new String("gaurav");
        StringBuffer sb1 = new StringBuffer("gaurav");
        StringBuffer sb2 = new StringBuffer("gaurav");

        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2)); //.equals not support for stringbuffer

        System.out.println(sb1.toString().equals(sb2.toString())); //convert into string & compare

        StringBuffer sb3 = new StringBuffer("java");
        StringBuffer sb4 = new StringBuffer("py");
        StringBuffer sb5 = sb3;

        System.out.println(sb3 == sb4);
        System.out.println(sb3 == sb5);





    }
}
