package Java0325Abstract;

public class Main {
    public static void main(String[] args) {
//        Java0325Abstract java0325Abstract = new Java0325Abstract(); 추상클래스는 인스턴스화X
        JavaChild javaChild = new JavaChild(); // 추상클래스를 상속한 클래스는 인스턴스화 가능
        System.out.println(javaChild.getValue());
        System.out.println(javaChild.getString());

        JavaChild javaChild1 = new JavaChild(20, "apple");
        System.out.println(javaChild.getValue());
        System.out.println(javaChild.getString());

        JavaChild javaChild2 = new JavaChild();
        javaChild2.setValue(999);
        javaChild2.setString("Banana");
        System.out.println(javaChild2.getValue());
        System.out.println(javaChild2.getString());
    }
}
