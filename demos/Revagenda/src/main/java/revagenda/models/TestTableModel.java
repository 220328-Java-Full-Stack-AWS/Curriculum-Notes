package revagenda.models;

public class TestTableModel extends Model{
    int id;
    String string;

    public TestTableModel() {
    }

    public TestTableModel(int id, String string) {
        this.id = id;
        this.string = string;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
