package inheritanceAndPolymorphism;

public class Instructor extends User{

    public Instructor(int id, String email, String password, int rating){
        super(id, email, password); // calling the constructor of parent from here
        this.rating = rating;
    }

    private int rating;
    //id, email and password -> came from inheritance
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
