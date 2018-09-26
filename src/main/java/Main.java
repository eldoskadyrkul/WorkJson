import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import spark.Route;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static void main(String[] args) {
        staticFileLocation("/");

        get("/getAllStudents", getAllStudents());
    }

    private static Route getAllStudents() {
        Route getRoute = ((request, response) -> {
            return OBJECT_MAPPER.writeValueAsString(getStudentFromJson());
        });
        return getRoute;
    }

    private static Route getAllStudentFromDataBase() {
        Route getRoute = (request, response) -> {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from Workers");
                List<Workers> workersList = new ArrayList<>();
                while (rs.next()) {
                    Workers workers = new Workers(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                    workersList.add(workers);
                }
                return workersList;
            } catch (Exception e) {
                LOGGER.error("ошибка ", e);
            }
            return new ArrayList<>();
        };
        return getRoute;
    }

    private static List<Student> getStudentFromJson() {
        List<Student> students = new ArrayList<>();
        try {
            InputStream inputStream = new FileInputStream("students.json");
            students = OBJECT_MAPPER.readValue(inputStream, new TypeReference<List<Student>>() {
            });

        } catch (FileNotFoundException e) {
            LOGGER.error("Файл students.json не найден", e);
        } catch (IOException e) {
            LOGGER.error("Ошибка при чтении items.json", e);
        }
        return students;
    }
}