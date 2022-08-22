import java.util.Random;


public class Game {
    
    private int marbles;
    private Human humanPlayer;
    private Computer computerPlayer;
    private int level;
    Random rand = new Random();
    
    public Game(int difficulty){
        this.marbles = rand.nextInt(101) + 10;
        this.humanPlayer = new Human();
        this.computerPlayer = new Computer(difficulty);
      
    }
           
    public void play() {
        int whoseTurn = rand.nextInt(2);
       
        while (this.marbles >0) {
            
            System.out.println("The pile contains " + this.marbles + " marbles.");
            
            if (whoseTurn % 2 == 0) {
                if (marbles == 1){
                    System.out.println("The computer loses. Congratulations!");
                    break;
                }
            computerPlayer.move(marbles);
            marbles = marbles - computerPlayer.getChoice();        
            System.out.println("The computer chooses " + computerPlayer.getChoice() + " marbles.");
           
            }
           
            
            else {
                if (marbles == 1) {
                    System.out.println("Sorry, the computer won. You lose.");
                    break;
                }
             humanPlayer.move(marbles);
             marbles = marbles - humanPlayer.getChoice();
                
            }
            whoseTurn++;
        } 
    }
}
