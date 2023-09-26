
public class NestedInner {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();

    }
}