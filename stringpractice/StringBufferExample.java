package stringpractice;
//Common Methods in StringBuffer
public class StringBufferExample {
    public static void main (String[] args){
        StringBuffer sb1 = new StringBuffer(); //---default 16
        StringBuffer sb2 = new StringBuffer("gaurav");
        StringBuffer sb3 = new StringBuffer(500); //initial capacity

        System.out.println(sb2.length());
        System.out.println(sb1.capacity());
        System.out.println(sb3.capacity());

        StringBuffer sb4 = new StringBuffer("java");
        System.out.println(sb4);
        sb4.append("language");
        System.out.println(sb4);

        System.out.println(sb4.insert(0, "zzzz"));

        StringBuffer sb5 = new StringBuffer("hello word");
        System.out.println(sb5.replace(6,10, "javaaaaaaa "));

        StringBuffer sb6= new StringBuffer("java code");
        System.out.println(sb6.delete(6,9));

        System.out.println(sb6.reverse());

        System.out.println(sb5.charAt(2));

        sb5.setCharAt(2,'Z');
        System.out.println(sb5);
    }
}
