package BookForLife;

public class KidUsers implements LibraryUser {

    int age = 12;
    String bookType = "kids";

    public int getAge() {
        return age;
    }
    
    public void setAge(int age){
    this.age = age;
    }
    public String getBookType() {
        return bookType;
    }
    
    public void setBookType( String bookType){
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (getAge() < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestbook() {
        if (getAge() < 12 && getBookType() == bookType) {
            System.out.println("Book Issued successfully, please return the book within 10 day");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }

}
