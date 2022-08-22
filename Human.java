import java.util.Scanner;

public class Human {
   
    private int choice;
    private Scanner input;
    
    public Human() {
        this.input= new Scanner(System.in);
        this.choice = -1;
    }
    
    public void move(int marblesLeft) {
        System.out.println("It is your turn. Please choose a value.");
        choice= input.nextInt();
        
        while (choice < 1 || choice > marblesLeft/ 2) {
            System.out.println("This is not a legal option. Choose a different value. ");
            choice = input.nextInt();
        }        
    }
    
    
    public int getChoice() {
        return this.choice;
    }    
}
