package check;

//constantsパッケージインポート
import constants.Constants;

public class Main {
    
    private String firstName = "長谷川";
    private String lastName = "瑠香"; 
   
    
    //printNameメソッド
    private static void printName (String firstName,String lastName) {
        System.out.println("printNameメソッド→ " + firstName + lastName);
    }
    
    
    public static void main(String[] args) {
        
        printName("長谷川", "瑠香");
             
        //Petクラスインスタンス化
       Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
      pet.introduce();
      
      //RobotPetクラスインスタンス化
       RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
       robotPet.introduce();
       
 }
}

