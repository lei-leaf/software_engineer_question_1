import java.util.*;  

public class Main {
  public static void main(String[] args) {
   List<Integer> numList = new ArrayList<>();   
   //adds the values to the list
   for(int x = 1; x<10; x++)
   {
    numList.add(x);    
   }
   int t = 1;
  //Converts List to Array  
  Integer[] array = new Integer[numList.size()];    
  numList.toArray(array); // fill the array
  printeverythird(array,t);
   
  }


 public static int printeverythird(Integer[] array, int counter)
  {  
      if(counter % 3 == 0)
      {
    	System.out.println("Third element: " + array[counter-1]); 
      }
      if(counter != 9){
      return printeverythird(array, counter + 1);
      }
      else{
        return 0; 
      }
  }
  
}