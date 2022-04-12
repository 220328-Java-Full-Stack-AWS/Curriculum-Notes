package revagenda.persistence;

import revagenda.ConnectionManager;
import revagenda.models.TestTableModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


/**
 * This is a DAO class, which means it is used to access a datasource in order to store or retrieve data
 * This implements the CRUDInterface which sets forth a 'contract' or 'promise' so to speak.
 * The CRUDInterface has a generic type associated with it, which in this case is resolved to TestTableModel
 */
public class TestTableDAO implements CRUDInterface<TestTableModel>{

    /**
     * Inserts a model into the database in the test_table table
     * @param model - The POJO to be inserted into the database. Pojo must extend the Model abstract class.
     */
    @Override
    public void create(TestTableModel model) {
        String sql = "INSERT INTO test_table (id, string) VALUES (?, ?)";
        try {
            PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
            pstmt.setInt(1, model.getId());
            pstmt.setString(2, model.getString());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * This returns a model object from a table row
     * @param id - The ID to identify the row we wish to retrieve from the database
     * @return - TestTableModel which contains the info retrieved form the corresponding table row
     */
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

    /**
     * This updates a row in the database based on a model
     * @param model - the object used to update the corresponding row in the table based on id
     */
    @Override
    public void update(TestTableModel model) {
        String sql = "UPDATE test_table SET string = ? WHERE id = ?";
        try {
            PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
            pstmt.setString(1, model.getString());
            pstmt.setInt(2, model.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * This deletes a single row from the database based on id
     * @param id The ID to identify the row we wish to delete
     */
    @Override
    public void delete(int id) {
        String sql = "DELETE FROM test_table WHERE id = ?";
        try {
            PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * This deletes a single row from the database based on id included in model object
     * @param model The model containing the ID to identify the row we wish to delete
     */
    @Override
    public void delete(TestTableModel model) {
        String sql = "DELETE FROM test_table WHERE id = ?";
        try {
            PreparedStatement pstmt = ConnectionManager.getConnection().prepareStatement(sql);
            pstmt.setInt(1, model.getId());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * returns a list of the entire contents of test_table
     * @return a LinkList of TestTableModel objects which represent the entire test_table table
     */
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
