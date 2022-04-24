import db.BaseDatabase;
import domain.Log;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Stream;

public class WebApplication {
    public static void main(String[] args) throws SQLException {
        BaseDatabase db = new BaseDatabase();
        db.checkDBExists();
    }
}
