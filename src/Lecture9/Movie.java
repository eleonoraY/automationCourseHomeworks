package Lecture9;

public class Movie {
    String title;
    String genre;
    double rating;

    public Movie(String title, String genre, double rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public void showInfo(){
        System.out.println("The title of the movie is " + title + ". The genre is " + genre + " and it's rating is " + rating + ".");
    }
}
