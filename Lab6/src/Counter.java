public class Counter {
    private int value;

    public void click() {
        value++;
    }

    public int getValue() {
        return value;
    }

    public void reset() {
        value=0;
    }

    public void undo() {
        value--;
    }

}
