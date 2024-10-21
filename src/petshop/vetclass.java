
package petshop;


public class vetclass 
{
     private  String Doctor;
   private  int VetNum;
    private int officeNum;
      public vetclass(String Doctor, int VetNum,int officeNum)
    {
        this.Doctor= Doctor;
        this.VetNum=VetNum;
        this.officeNum=officeNum;
    }
    public void displayInfo()
    {
        System.out.println("Doctor name: " + Doctor + "vet number: " + VetNum + "office number: " + officeNum);
    }
        

}
 
        
