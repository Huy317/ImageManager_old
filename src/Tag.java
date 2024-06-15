public class Tag {
    private final String name;
    private int count; // number of images that have this tag

    public Tag(String name) {
        this.name = name;
        this.count = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void incrementCount() {
        this.count++;
    }

    public void decrementCount() {
        this.count--;
    }
}
