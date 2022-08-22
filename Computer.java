import java.util.Random;

public class Computer {
    
    private int mode;
    private int choice;
    
    public Computer(int m) {
        mode = m;
        this.choice = -1;
    }
    
    public void move(int marblesLeft) {
    
        //mode 1: stupid mode or 2^n-1 pile
        if (mode == 1 || marblesLeft == 3 || marblesLeft == 7 || marblesLeft == 15 ||
            marblesLeft == 15 || marblesLeft == 31 || marblesLeft == 63) { 
            
            Random rand = new Random();
            choice = rand.nextInt(marblesLeft/2) + 1; 
            if (choice == 0) choice = 1;
           
        }             
        
        //smart mode
        else { 
            int n = 1;
            while (n*2 < marblesLeft) {
                n = n*2;
            }
            choice = n - 1;
           
            if (choice == 0) choice = 1; // designed to make 0 not a legal option
           }
    
    }
        
    public int getChoice() {
            return choice;
    }    //getChoice() returns the value of choice
}
