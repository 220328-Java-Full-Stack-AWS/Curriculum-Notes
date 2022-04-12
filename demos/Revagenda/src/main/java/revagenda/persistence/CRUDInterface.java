package revagenda.persistence;

import revagenda.models.TestTableModel;

import java.util.List;

public interface CRUDInterface {
    //CRUD - create, read, update, delete
    public void create(TestTableModel model);
    public TestTableModel read(int id);
    public void update(TestTableModel model);
    public void delete(int id);
    public void delete(TestTableModel model);
    public List<TestTableModel> getAll();

}
