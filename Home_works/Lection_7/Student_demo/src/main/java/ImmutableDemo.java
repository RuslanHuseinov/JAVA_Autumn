public final class ImmutableDemo {
    private final int x;
    private final Object object;

    public ImmutableDemo(int x, Object object) {
        this.x = x;
        this.object = object;
    }

    public int getX() {
        return x;
    }

    /*public Object getObject() {
        return object.clone();
    }*/
}
