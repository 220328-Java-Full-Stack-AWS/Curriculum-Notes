package revagenda.persistence;

import revagenda.models.ToDoItemModel;

import java.util.List;

public class ToDoItemDAO implements CRUDInterface<ToDoItemModel>{

    //Group A
    @Override
    public void create(ToDoItemModel model) {

    }

    //Group B
    @Override
    public ToDoItemModel read(int id) {
        return null;
    }

    //Group C
    @Override
    public void update(ToDoItemModel model) {

    }

    //Group D
    @Override
    public void delete(int id) {

    }

    //Group E
    @Override
    public void delete(ToDoItemModel model) {

    }

    //Group F
    @Override
    public List<ToDoItemModel> getAll() {
        return null;
    }
}
