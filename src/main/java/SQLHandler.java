import java.sql.*;

public class SQLHandler {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public SQLHandler() {
        connect();
        statement();
    }

    //metodi
    private void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?" + "user=root&password=root" + "&serverTimezone=UTC");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void statement() {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void queryAll() {
        try {
            resultSet = statement.executeQuery("SELECT * FROM Persone");

            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String cognome = resultSet.getString("cognome");

                System.out.println(id + ": " + nome + " " + cognome);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Persone queryAllPersone() {
        Persone persone = new Persone();

        try {
            resultSet = statement.executeQuery("SELECT * FROM Persone");

            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String cognome = resultSet.getString("cognome");

                persone.add(new Persona(id, nome, cognome));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persone;
    }
    public ResultSet query(String query) {
        try {
            return statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        SQLHandler sqlHandler = new SQLHandler();

        sqlHandler.queryAll();

        System.out.println();

        ResultSet resultSet = sqlHandler.query("SELECT * FROM Persone WHERE Cognome LIKE 'A%' ORDER BY Nome");
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String cognome = resultSet.getString("cognome");

                System.out.println(id + ": " + nome + " " + cognome);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
