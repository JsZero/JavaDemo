package cn.neu.demo.stringbufferpool;

public class StringConstantPool {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println("=============================================");
        String str3 = "Hello";
        String str4 = new String("Hello");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println("=============================================");
        String str5 = new String("Hello");
        String str6 = new String("Hello");
        System.out.println(str5 == str6);
        System.out.println(str5.equals(str6));
        System.out.println("=============================================");
    }
}
