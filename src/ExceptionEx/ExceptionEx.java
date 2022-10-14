package ExceptionEx;

public class ExceptionEx {
    public static void main(String[] args) {
//       NullPointerException 발생
//        String data = null;
//        System.out.println(data.toString());

//      ArrayIndexOutOfBoundsException 발생
//        String data1 = args[0];
//        String data2 = args[1];
//
//        System.out.println("args[0] : " + data1);
//        System.out.println("args[1] : " + data2);


//        NumberFormatException 발생
        String data1 = "100";
        String data2 = "a100";
        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);

        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + " = " + result);
    }
}
