package Java0308Class;

public class Students {
    //필드영역
    private String name;
    private int age;
    private String address;
    private String personalNum;
    //필드영역

    public Students() { // Constructor를 만들때는 기본생성자와 안기본생성자를 동시에 만드는걸 추천함
                        // null 의 값을 이용해서 오류를 방지함
    }

    public Students(String name, int age, String address, String personalNum) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.personalNum = personalNum;

    }

    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonalNum() {
        return personalNum;
    }



    public void displayName() { // 메소드
        System.out.println(this.name);
    }
    public  void diplayAge() {
        System.out.println(this.age);
    }
    public  void displayAddress() {
        System.out.println(this.address);
    }
    public void  displayAll() {
        System.out.println(this.name + " " + this.age + " "+ this.address);
    }
}
