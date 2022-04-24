package domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListCinema {
     @JsonProperty("films")
    public List<Cinema> cinemaList = new ArrayList<>();
    int pagesCount;

    static public class Cinema {

        public int filmId;
        public int ratingVoteCount;

        public String nameRu;
        public String nameEn;
        public String year;
        public String rating;
        public String posterUrl;
        public String posterUrlPreview;
        public String ratingChange;
        public String filmLength;

        public List<Country> countries = new ArrayList<>();
        public List<Genre> genres = new ArrayList<>();

        static
        class Country {
            @JsonProperty("country")
            public String country;

        }

        static
        class Genre {

            @JsonProperty("genre")
            public String genre;
        }

    }
}
