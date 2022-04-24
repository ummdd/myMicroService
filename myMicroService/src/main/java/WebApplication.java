import db.BaseDatabase;
import domain.Log;
import service.CinemaUploadService;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Stream;



public class WebApplication {


    public static void main(String[] args) throws SQLException {
        final String uploadToken = "761bc3e3-4079-4378-8358-3bd14f0238bd";

        CinemaUploadService service = new CinemaUploadService(uploadToken);
        service.uploadFirstBest250();


//        BaseDatabase db = new BaseDatabase();
//        db.checkDBExists();
    }
}
