import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {


    //citations and create user object
UserStory us = new UserStory();
    String[] names = us.getName();
    double[] ratings = us.getRating();
    String[] categories = us.getCategory();
    String[] stores = us.getStoreName();
// print results 
    System.out.println(us.toString());

// System.out.println("Some of the best rated shirts (4.5 and above) are: ");
//     System.out.println(us.bestShirts());
   
  }
}