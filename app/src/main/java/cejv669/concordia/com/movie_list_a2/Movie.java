package cejv669.concordia.com.movie_list_a2;

public class Movie {

    private String movie_id;
    private String movie_name;
    private String movie_rate;
    
    

    public Movie(){

    }


    public Movie(String movie_id, String movie_name, String movie_rate){
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.movie_rate = movie_rate;
    }

    public Movie(String movie_name, String movie_rate) {
        this.movie_name = movie_name;
        this.movie_rate = movie_rate;
    }


    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_rate() {
        return movie_rate;
    }

    public void setMovie_rate(String movie_rate) {
        this.movie_rate = movie_rate;
    }
}
