package BookForLife;

//import UserLibrary.KidUsers;
//import UserLibrary.AdultUser;
import java.util.*;

public class LibraryInterfaceDemo {

    static KidUsers kd = new KidUsers();
    static AdultUser ad = new AdultUser();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome In E-Library");
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();
        System.out.println("We have some books categories, which category you want to explore. \n (k) for Kids book \n (a) for Adult book \n  Choose one of them : ");
        Scanner scc = new Scanner(System.in);
        char bookType = scc.nextLine().charAt(0);
        String book = "";
        if (bookType == 'k') {
            book = "Kids";
        } else {
            book = "Adult";
        }
        System.out.println("You have Entered your age is  " + age + " & you want to read " + book + " category books");
        switch (bookType) {
            case 'k':                
                kd.setAge(age);
                kd.registerAccount();
                kd.setBookType(book);
                kd.requestbook();
                break;
            case 'a':
                ad.setAge(age);
                ad.registerAccount();
                ad.setBookType(book);
                ad.requestbook();
                break;
            default:
                System.out.println("Wrong Choice !:");
        }
    }//end of main
    
}
