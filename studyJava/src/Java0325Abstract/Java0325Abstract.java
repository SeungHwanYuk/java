package Java0325Abstract;

abstract public class Java0325Abstract {

    int a;

    String b;

    public Java0325Abstract() {
        this.a = 10;
        this.b = "default";
    }

    public Java0325Abstract(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getValue() {
        return a;
    }
    abstract public String getString();

    public void setValue(int a) {  // 세터(Setter) 메서드
        this.a = a;
    }
    public void setString(String b) { // 세터(Setter) 메서드
        this.b = b;
    }

}
