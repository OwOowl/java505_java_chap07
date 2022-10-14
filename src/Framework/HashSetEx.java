package Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("mybatis");

        int size = set.size();
        System.out.println("HashSet에 저장된 수 : " + size);

//        Iterator : 저장된 객체를 한번씩 가져는 반복자 리턴
        Iterator<String> iterator = set.iterator();

//        set 컬렉션의 경우 순서가 없기 때문에 일반적인 반복문 사용 불가.
//        Iterator를 사용하여 임의의 순서를 만들고, hasNext()를 사용하여 남아있는 요소를 하나씩 가져옴
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("mybatis");


        System.out.println("HashSet에 저장된 수 : " + set.size());

        iterator = set.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println("HashSet이 비어있음");
        }
    }
}
