package POJO_and_Records;

public class Lesson89 {
    private String id;
    private String name;
    private String dateOfBrith;
    private String classList;

    public Lesson89(String id, String name, String dateOfBrith, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBrith = dateOfBrith;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Lesson89{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBrith='" + dateOfBrith + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(String dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
