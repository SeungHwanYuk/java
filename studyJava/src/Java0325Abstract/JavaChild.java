package Java0325Abstract;

public class JavaChild extends Java0325Abstract {

    public JavaChild() {
        super();
    }

    public JavaChild(int a, String b) {
        super(a, b);
    }

    @Override
    public String getString() {
        return super.b; // 반드시 부모(super)나 자식(this)인지 남겨주도록 하자
    }
    public void setValue(int a) {
        super.setValue(a);
    }
    public void setString(String a) {
        super.setString(b);
    }
}
