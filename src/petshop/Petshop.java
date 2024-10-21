
package petshop;

public class Petshop 
{
 public static void main(String[] args) 
    {
      //variables
        String Dogbreed ="Chiwawas"; 
        int NumDogs=12;
        {
            System.out.println("we have " +NumDogs + " Dogs and the breed is " + Dogbreed);
           
        }
        //if-eles statement
        int NumBreeds =10;
        
 
        if (NumBreeds >= 10)
        {
            System.out.println("there are more than 10 breeds");   
        }
        else
        {
            System.out.println("there are less than 10 breeds");
        }
        //for loop
        for(int Dogs = 50; Dogs<60; Dogs++)
        {
            System.out.println("Dog number:" + Dogs);
        }
        vetclass get = new vetclass( "pol",2, 8);
        get.displayInfo();
        booleanexample fetch = new booleanexample();
        fetch.checkweather();
    }
    
}
