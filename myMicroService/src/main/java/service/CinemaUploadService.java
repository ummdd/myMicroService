package service;

import domain.ListCinema;
import org.codehaus.jackson.map.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CinemaUploadService {
    private final String token;

    public CinemaUploadService(String token) {
        this.token = token;
    }

    public void uploadFirstBest250() {

        String s = "";
        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://kinopoiskapiunofficial.tech/api/v2.2/films/top?type=TOP_250_BEST_FILMS"))
                    .header("X-API-KEY", token)
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper objectMapper = new ObjectMapper();
            ListCinema listCinema = objectMapper.readValue(response.body(), ListCinema.class);

            for (ListCinema.Cinema cinema : listCinema.cinemaList) {
                System.out.println(cinema.nameRu);
            }

            System.out.println("tested");


//            String cinemaResponse =
        } catch (Exception e) {
            System.out.println("kinopoiskapiunofficial REQUEST EXCEPTION");
            e.printStackTrace();
        }

    }


}