package Programming;

public class Member {
    private String name;
    private String id;
    private String password;
    private int age;

    // 모든 회원 정보를 사용해 객체를 생성하는 생성자
    public Member(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    // 접근자(Getter)와 설정자(Setter)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}