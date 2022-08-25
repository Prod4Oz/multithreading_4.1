public class Call {
    private int id;

    public Call(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Calls{" +
                "id=" + id +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }
}
