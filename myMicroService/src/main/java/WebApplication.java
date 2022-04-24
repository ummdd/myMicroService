import db.BaseDatabase;
import domain.Log;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Stream;

public class WebApplication {
    public static void main(String[] args) throws SQLException {
        List<Log> logs = List.of(
                new Log("Сибирская сосна", 10),
                new Log("Дуб монгольский", 30),
                new Log("Берёза карликовая", 5));



        logs.stream().map(x -> x.getType()).forEach(System.out::println);
        Stream.generate(Math::random).limit(100).forEach(System.out::println);

        BaseDatabase db = new BaseDatabase();
        db.checkDBExists();
    }
}
