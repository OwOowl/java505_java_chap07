package Framework;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }


//    new 키워드로 객체를 생성할때 개별 주소값을 받기 때문에 내용이 같아도 주소값이 다르기 때문에 모두 저장됨
//    내용이 같으면 같은 객체로 설정하는 법
//    Object 타입 : 자바의 최상위 클래스
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {    // 매개변수 obj가 Member 타입인지 확인
            Member member = (Member) obj;   // obj를 Member로 타입 변환
//            객체의 이름/나이와 클래스에 저장된 이름/나이가 같으면 true
            return member.name.equals(this.name) && (member.age == this.age);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
