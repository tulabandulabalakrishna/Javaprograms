import java.util.Objects;

public class DataKey {

    private String name;
    private int id;

    // getter and setter methods

    @Override
    public String toString() {
        return "DataKey [name=" + name + ", id=" + id + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("in equals");
        if (this == o) return true;
        if (!(o instanceof DataKey)) return false;
        DataKey dataKey = (DataKey) o;
        return getId() == dataKey.getId() &&
                Objects.equals(getName(), dataKey.getName());
    }

    @Override
    public int hashCode() {
        System.out.println("in hashcode");
        return Objects.hash(getName(), getId());
    }
}