package revagenda;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectionManager {
    //keep track of the connection
    private static Connection connection;
    //private static ConnectionManager connectionManager;

    //keep track of this singleton
    //How to make a singleton:
    //Making the constructor private, so it can't be invoked
    private ConnectionManager() {
    }

    /*
    This actually serves no purpose as the way we have implemented this class all methods are static, and all
    fields are also static, so there's nothing unique about an object of this class.
     */
//    public static ConnectionManager getConnectionManager() {
//        if(connectionManager == null) {
//            connectionManager = new ConnectionManager();
//        }
//
//        return connectionManager;
//    }


    public static Connection getConnection(){
        if(connection == null) {
            connection = connect();
        }

        return connection;
    }

    public static void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        connection = null;
    }

    //establish connection method
    private static Connection connect(){
        /*
        jdbc:postgresql://hostname:port/databaseName
        //?currentSchema=schemaName
        This is the string we need to use to connect to our database. We will build this string with each of the
        variables filled out and qualified.
         */

        /*
        Old File IO method to load properties
            Properties props = new Properties();
            FileReader fr = new FileReader("src/main/resources/application.properties");
            props.load(fr);
         */


        try {

            //New method grabbing the properties from the JAR classpath
            Properties props = new Properties();
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            InputStream input = loader.getResourceAsStream("application.properties");
            props.load(input);


            String connectionString = "jdbc:postgresql://" +
                    props.getProperty("hostname") + ":" +
                    props.getProperty("port") + "/" +
                    props.getProperty("dbname") + "?schemaName=" +
                    props.getProperty("schemaName");

            String username = props.getProperty("username");
            String password = props.getProperty("password");

            connection = DriverManager.getConnection(connectionString, username, password);

            //Set search path to access different schemas:
            String sql = "set search_path to \"$user\", public, test";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.executeUpdate();

            //test it:
//            String select = "select * from new_table";
//            PreparedStatement selectStatement = connection.prepareStatement(select);
//            ResultSet rs = selectStatement.executeQuery();
//            while(rs.next()) {
//                System.out.println(rs.getString("string"));
//            }


            System.out.println("Connection String: " + connectionString);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }


        return connection;

    }
}
