import java.util.Scanner;

public class UserStory {

  // TODO #1 Establish 1D arrays/instance variables
private String[] itemName;   //first 1D array used to store item names (should always be the same length as category)
private String[] category;   //second 1D array used to store item category (should always be the same length as itemNames)
private double[] rating;     //third 1D array used to store item rating 
private String[] storeName;  //fourth 1D array used to store store name 

  // TODO #2 file readers

public UserStory(){
  itemName = FileReader.toStringArray("itemName.txt");
  category = FileReader.toStringArray("Category.txt");
  rating = FileReader.toDoubleArray("UserRating.txt");
  storeName = FileReader.toStringArray("StoreName.txt");
  
}
  
  // TODO #3 create getName() method

public String[] getName(){
  return itemName;
}
  
  // TODO #4 create getRating() method
public double[] getRating(){
  return rating;
}

  // TODO #5 create getCategory() method

public String[] getCategory(){
  return category;
}

  // TODO #6 create getStoreName() method

public String[] getStoreName(){
  return storeName;
}


// find the shirts with a rating of 4.0 or higher

public String bestShirts(){
String best = "";

  for(int i=0; i < itemName.length;i++){
    if(rating[i]>=4.5){
      best += "\n" + itemName[i] + "\nRating: " + rating[i] + " --- Store: " + storeName[i] + "\n";
    }
  }
return best;
  
}
// final : create to string method
public String toString(){
  return "Total items: " + itemName.length;
}


  
}