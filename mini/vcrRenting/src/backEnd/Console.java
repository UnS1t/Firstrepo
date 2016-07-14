
package backEnd;
import java.util.Scanner;

public class Console {
    
    
    public void menu(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        
        System.out.println("Please choice your menu.");
         System.out.println("1.Clients");
          System.out.println("2.Database");
           System.out.println("3.Rent");
           choice = input.nextInt();
           
           switch(choice){
               case 1:
                   client();
                   break;
               case 2:
                   database();
                   break;
               case 3:
                   rent();
                   break;
               default:
                    System.out.println("this number is not in the choice !");
                    
           }
           
    }
    
    public void client(){
        String[] whatData = {"ID","name","phone number","address"};
        
        commands(whatData,"client");
          
        
    }
    
    public void database(){
        
          String[] whatData = {"ID","title","duration"};
          commands(whatData,"database");
          
    }
    
    public void rent(){
        String[] whatData = {"name","vcrID","BillID"};
        commands(whatData,"Renting");
        
      
    }
    public void commands(String[] whatData,  String whatMenu){
         System.out.println("This is the " + whatMenu + " menu." + "\n Please choose your command");
         Scanner input = new Scanner(System.in);
         int choice = 0;
          System.out.println("1.Show list");
           System.out.println("2.Edit");
           System.out.println("3.Add");
            System.out.println("4.Delette");
            System.out.println("5. Return to menu");
            choice = input.nextInt();
            input.close();
            switch(choice){
                case 1:
                    list(whatMenu);
                    break;
                case 2:
                    edit(whatData,whatMenu);
                case 3:
                    add(whatData,whatMenu);
                    break;
                case 4:
                del(whatMenu);
                    break;
                case 5:
                    menu();
                    break;
                    
            }
    }
    public void list(String whatMenu){
        
       
        
    }
    public void add(String[] whatData,String whatMenu){
        
        
    }
    
    public void edit(String[] whatData, String whatMenu){
        
    }
    public void del(String whatMenu){
        
    }
    
        
    
}
