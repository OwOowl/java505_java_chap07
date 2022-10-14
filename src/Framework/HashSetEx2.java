package Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args){
//        문제 1) HashSet 사용하여 로또번호 7개를 생성하는 프로그램 작성
        Set<Integer> lotto = new HashSet<>();

        int count =0;
        while(count < 7) {
            int rnd = (int) (Math.random() * 45) + 1;

            if(lotto.add(rnd)) { // lotto에 rnd값이 들어간 경우
                count++;
                if (lotto.size() == 7) { // lotto 크기가 7인 경우
                    break;
                }
            }
        }

        Iterator<Integer> iter = lotto.iterator();
        String number = "";
        while(iter.hasNext()) {
            int num = iter.next();
            number += String.valueOf(num) + " ";
        }
        System.out.println(number);





        System.out.println("\n\n");






        Set<Member> set = new HashSet<>();

//        new 키워드로 객체를 생성할때 개별 주소값을 받기 때문에 내용이 같아도 주소값이 다르기 때문에 모두 저장됨
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println("총 객체 수 : " + set.size());
    }
}
