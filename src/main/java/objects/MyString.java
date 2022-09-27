package objects;

public class MyString {
    public static void main(String[] args) {
        myString();
    }

    public static void myString() {
        String a = "Hello world";
        System.out.println(a.substring(0,2));

        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));

        String s1="hello";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
