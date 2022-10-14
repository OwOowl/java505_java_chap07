package ExceptionEx;

public class Calculator {
    public void sum(String a, String b){
        try{
            int result = 0;
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            result = num1 + num2;
            System.out.println("두 수의 합은 " + result + "입니다.");
        }
        catch(Exception e){
            System.out.println("sum  함수 연산 시 오류가 발생 했습니다.");
        }
    }

//    예외 발생 시 해당 메서드를 사용하는 곳으로 예외를 떠넘김
    public void sub(String a, String b) throws Exception{
        int num1 = Integer.parseInt(a); // 오류 발생 가능성이 있는 소스
        int num2 = Integer.parseInt(b); // 오류 발생 가능성이 있는 소스
        int result = num1 - num2;
        System.out.println("두 수의 차는 " + result + "입니다.");
    }
}
