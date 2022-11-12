import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test11 {

    public static void main(String[] args) {

        try{
            String url = "jdbc:postgresql://localhost:5432/sbgm";
            String username="postgres";
            String password="root";

            String sql_select="SELECT * FROM employee";

            Connection conn = DriverManager.getConnection(url,username,password);

            PreparedStatement preparedStatement = conn.prepareStatement(sql_select);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");

                System.out.println("Id :"+id+" Name :"+name+" Surname :"+surname);

            }

            String insert_sql = "insert into employee(name,surname) values('Test','Developer')";
            preparedStatement = conn.prepareStatement(insert_sql);
            preparedStatement.executeUpdate();


        }
        catch (Exception ex) {
            System.out.println(ex);
        }


    }
}
