# NimGame
/*


Divided into 4 Classes: Computer.java & Human.java, Game.java, Nim.java (Tester Method)

Computer.java
* Two private instance integer variables called (int mode) and (int choice)
     - int mode denotes smart or stupid mode that Computer plays in 
     - int choice determines the number of marbles the computer wants to take
     
* Constructor called Computer which takes in a local parameter of m
    * implicit parameter (mode) is set to explicit paramters (m)
    * this keyword is applied and choice is given a default value of -1
    
* move is a method that holds what version of the game that the computer plays: smart or stupid
    * it takes in an integer value called marblesLeft
    * uses an if/else block to determine stupid vs. smart version: 
        * mode 1: this mode is used if Computer is playing in stupid version or 
          if the pile is exactly a value of a power of 2 minus 1;          
          - the method creates a random object (rand) and sets 
            choice to a random value between 1 and n/2
        * mode 2: this is the smart mode which removes 2^n-1 marbles with each choice  
          - the method uses an algorithm that compares the # of marbles 
            left in pile to powers of two and when it finds the lowest 
            power that doesn't surpass the amount of marbles, it subtracts 1

- the if statements are designed to make 0 an illegal option, the least has to be 1 (had to be hardcoded)
         
* getChoice returns the value of choice


Human.java 
* Two private instance values called (int choice) 
  and (Scanner input) which takes the user's input
* Constructor called Human initializes input with creating 
  an instance from Scanner and initializes choice to -1
* move method determines the amount of marbles that a human takes
    * choice is set to the variable instantiated by the Scanner class
    * if the user's choice is less than 1 or greater 
      than the number of total marbles divided by 2, the compiler 
      prompts the user to re-enter a value that is legal
* getChoice() is a method that returns choice
    


Game.java

* Four private instances with two primitive variables (int marbles) and (int level) 
  and two instances of the other classes (Human humanPlayer) and (Computer computerPlayer)
* instance of Random class is created (rand)
     - determines number of marbles, creates two players, and the level of game
* Constructor called Game which takes in a local parameter of difficulty
    * initializes number of marbles with random function from 10 to 100
    * initializes human player
    * initializes computer player and takes in difficulty parameter
* play is a method that oeprates the entire game
    * whoseTurn is an integer variable that uses random oeprator 
      to determine whose turn it is with 0 or 1 int
    * uses while loop to determine repetition of play and longevitiy of 
      game which continues while marbles are greater than 0
        * prints out initial number of marbles in pile
        * uses mod operator to determine whose turn it is: if whoseTurn % 2 equals 0 
          then it will be the computer's turn first
        * if statement is used to check if the computer loses during its turn 
          when the number of marbles left is 1 
        * when the number of marbles is more than 1, 
          the computer player object calls the move method and calls in the number of marbles
        * returns the choice of marbles to remove the computer's choice of marbles from the total pile of marbles
        * prints out computer's choice of marbles
    * when whoseTurn % 2 does not equal to 0, it uses the same if block 
      used above to determine if the human player loses
    * the human player instance invokes the move method as well calling in the number of marbles
    * returns the choice of marbles to remove the human's choice of marbles from the total pile of marbles
        
  *whoseTurn adds 1 to repeat loop and switch players with each iteration



*/
