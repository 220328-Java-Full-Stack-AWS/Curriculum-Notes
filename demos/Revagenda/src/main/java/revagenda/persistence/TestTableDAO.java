package revagenda.persistence;

import revagenda.ConnectionManager;
import revagenda.models.Model;
import revagenda.models.TestTableModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class TestTableDAO implements CRUDInterface<TestTableModel>{

    @Override
    public void create(TestTableModel model) {

    }

    @Override
    public TestTableModel read(int id) {
        TestTableModel model = new TestTableModel();
        try {
            String SQL = "SELECT * FROM test_table WHERE id = ?";
            Connection conn = ConnectionManager.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();


            while(rs.next()) {
                model.setId(rs.getInt("id"));
                model.setString(rs.getString("string"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return model;
    }

    @Override
    public void update(TestTableModel model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void delete(TestTableModel model) {

    }

    @Override
    public List<TestTableModel> getAll() {
        List<TestTableModel> list = new LinkedList<>();
        try {
            String SQL = "SELECT * FROM test_table";
            Connection conn = ConnectionManager.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(SQL);

            ResultSet rs = pstmt.executeQuery();


            while(rs.next()) {
                TestTableModel model = new TestTableModel();
                model.setId(rs.getInt("id"));
                model.setString(rs.getString("string"));
                list.add(model);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
