package Counter;

public class Counter {
    int defaultValue = 0;
    int fieldReset;

    public Counter() {
        this.defaultValue = 0;
    }

    public Counter(int num) {
        this.defaultValue = num;
        fieldReset = num;
    }

    public void add(int number) {
        this.defaultValue += number;
    }

    public void add() {
        this.defaultValue = 1;
    }

    public int get() {
        return defaultValue;
    }


    public void reset() {
        this.defaultValue = fieldReset;
    }
}
