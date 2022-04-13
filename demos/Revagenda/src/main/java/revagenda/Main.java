package revagenda;


import revagenda.models.TestTableModel;
import revagenda.persistence.TestTableDAO;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        //Connection conn = ConnectionManager.getConnection();
        TestTableDAO dao = new TestTableDAO();
        TestTableModel m = dao.read(1);
        System.out.println("Model: " + m.getId() + ", " + m.getString());

        List<TestTableModel> list = dao.getAll();
        for (TestTableModel temp : list) {
            System.out.println("Model: " + temp.getId() + ", " + temp.getString());
        }

        m.setString("I'm going home now.");

        dao.update(m);

        TestTableModel m2 = dao.read(1);
        System.out.println("Updated model: " + m2.getId() + ", " + m2.getString());

        ConnectionManager.close();


    }
}
        /*
        Need user input - console input via scanner
            later replaced with GUI - web interface in a browser
            HTTP request from client to server

        Output - console output
            later replaced with web GUI

        Validation - validate user input

        Data Persistence - store our info (to-do items) in a relational database - postgreSQL
                            store users - auth purposes

        client-server communication - our client should be able to send data and receive HTTP requests
        We need an API and we need to have our client "consume" the API

        Auth - We will want to allow users to register and login to their account. We want
                to-do items to be associated with particular users.

        Business logic - catch-all for everything not specified elsewhere.

        Hosting - we want to put our server in the cloud, we want our database also in the cloud, and we want to
        serve up our web GUI from some remotely accessible location.

        Translating from java memory to SQL schema. We will start with plain JDBC code (execute SQL scripts
        from java app), later we will put an ORM in place, which is a powerful tool that does this for us.

        Accessibility - make site user friendly.

        Documentation - javadocs, other inline documentation, as well as overview documentation, design docs like
                        ERD, UML models


         */