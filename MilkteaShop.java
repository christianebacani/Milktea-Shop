// Milkta Shop
// Created by Christiane A. Bacani
import java.util.Scanner;
public class MilkteaShop {
    public static void main(String[] args) {
       int price[] = {50,55,60};
       boolean order = true;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Welcome to Bacani`s Milktea Shop!\n");
        
        System.out.print("Username : ");
        String username = input.nextLine();
        
        System.out.print("Passowrd : ");
        String password = input.nextLine();
        
        int total = 0;
        while(order){
        System.out.print("AVAILABLE FLAVORS!\n");
        System.out.print("1.) Chocolate\n2.) Vanilla\n3.) Cookies `n Cream\n");
        System.out.print("Enter choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 4:
                System.out.print("\n\nINVALID CHOICE!");
                break;
                
        }
        
        System.out.print("1.) Small\n2.) Medium\n3.) Large\n");
        System.out.print("Enter size  : ");
        int size = input.nextInt();
              
        System.out.print("Enter quantity : ");
        int quantity = input.nextInt();
        
        total += price[choice - 1 ] * quantity;
        
        input.nextLine();
        System.out.print("Do you want to buy more ? (y/n) : ");
        String buyMore = input.nextLine();
        
        if(buyMore.equalsIgnoreCase("n")){
            order = false;
            
            System.out.print("The total price is : P " + total+ "\n");
            
            System.out.print("Enter your payment here : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            
            System.out.print("Change :  P " + change);
            
            System.out.print("\n\nTHANK YOU, PLEASE COME AGAIN!");
            
        }

        
        }
        
        
        
    }
}
