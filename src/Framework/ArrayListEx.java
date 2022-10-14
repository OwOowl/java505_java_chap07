package Framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
//        List 클래스가 ArrayList 클래스의 부모 클래스이므로 부모타입 변수에 자식클래스 타입 객체를 대입하여 사용
//        List<String> list2 = new ArrayList<String>();

        System.out.println("ArrayList 생성\nlist의 길이 : " + list.size());

        list.add("HTML5");
        list.add("CSS3");
        list.add("Bootstrap5");
        list.add("JS ES6");
        list.add("React");
        list.add("Java");
        list.add("Servlet/JSP");
        list.add("Spring framework");
        list.add("Spring boot");
        list.add("Database(MySql)");
        list.add("Python");

        System.out.println("\n데이터 추가 후 arraylist의 길이 확인 : " +list.size());

        String str = list.get(5);
        System.out.println("list의 5번 index의 값 : " + str);

        System.out.println("\n리스트의 전체 내용 출력");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("리스트 " + i + "번 index의 값 : " + list.get(i));
        }

        System.out.println("\nlist 안 데이터 삭제하기");
        list.remove(4);
        list.remove(2);
        list.remove("Java");

        System.out.println("\nremove 후 list의 크기");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("리스트 " + i + "번 index의 값 : " + list.get(i));
        }





    }
}
