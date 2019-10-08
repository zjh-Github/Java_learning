package test;

public class testStringBuffer {
    public static void main(String[] args) {

    }
     public static void test(){
        StringBuffer stringBuffer=new StringBuffer();
        for (int i= 'a';i<='z';i++){
            stringBuffer.append((char) i);
        }
        stringBuffer.reverse().delete(0,5);
        System.out.println(stringBuffer);
    }
}
