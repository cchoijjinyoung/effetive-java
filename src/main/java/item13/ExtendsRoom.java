package item13;

public class ExtendsRoom extends Room {
    private int z = 1;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (ExtendsRoom) super.clone();
    }

    public void hello() {
        System.out.println("자식 클래스");
    }
}
