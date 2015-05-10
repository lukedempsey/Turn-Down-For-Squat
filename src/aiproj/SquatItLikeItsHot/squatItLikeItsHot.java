package aiproj.SquatItLikeItsHot;
import aiproj.squatter.*;
import java.io.PrintStream;

/**
 * 
 * @author lukedempsey 638407, mason rose-campbell 638370
 *
 */

public class squatItLikeItsHot implements Player, Piece {
	
	//Initialises game objects
	private static Board board;
	
	//Initialises game variables
	private static Boolean debug = false;
	private Colour playerColour;
	private Colour opponentColour; //not sure if you can do this??
	
	
	@Override
	public int init(int n, int p) {
		/** TODO - This method is called by the referee to initialise the player. 
		The input parameters are as follows: n specifies the board dimension,
		and p specifies the piece that the player will use (according to the 
		Piece interface format) as assigned to your class by the referee. 
		Your implementation of this function should return a negative value 
		if it does not initialise successfully.*/
		
		board = new Board(n);

		if(p==1){
			playerColour = Colour.WHITE;
			opponentColour = Colour.BLACK;
		}else if(p==2){
			playerColour = Colour.BLACK;
			opponentColour = Colour.WHITE;
		}else{
			//invalid input p != 1 or 2
			return -1;
		}
		return 0;
	}

	@Override
	public Move makeMove() {
		/**TODO - This method is called by the referee to request a move by your player. 
		 * Based on the current board configuration, your player should select its next 
		 * move and return it as an object of the aiproj.squatter.Move class. 
		 * Note that each player needs to maintain its own internal state representation 
		 * of the current board configuration
		 */
		return null;
	}

	@Override
	public int opponentMove(Move m) {
		/**
		 This method is called by the referee to inform your player about the 
		 opponent's most recent move, so that you can maintain your board configuration. 
		 The input parameter is an object from the class aiproj.squatter.
		 Move, which includes the information about the last move made by the opponent. 
		 Based on your board configuration, if your player thinks this move is illegal 
		 you need to return -1 otherwise this function should return 0.
		 */
		return 0;
	}

	@Override
	public int getWinner() {
		/**This method should check the board configuration for a possible winner and return 
		 * the winner as an integer value according to the Piece interface 
		 * (-1=INVALID, 0=EMPTY, 1=WHITE, 2=BLACK, 3=DEAD). 
		 * Note that EMPTY corresponds to a non-terminal state of the game, 
		 * DEAD corresponds to a draw, and INVALID corresponds to the case that 
		 * the game has ended because the opponent move was illegal 
		 * (e.g., placing a piece on an already occupied or captured cell).
		*/
		return 0;
	}

	@Override
	public void printBoard(PrintStream output) {
		/**This method is called by the referee to ask your player to print its 
		 * board configuration to a PrintStream object output. Note that this 
		 * output will be similar to the format specified in Project Part A, 
		 * i.e., we would suggest using B, W, or +, corresponding to a Black piece still in play, 
		 * a White piece still in play, or a free cell, respectively, and b, w, or -, 
		 * corresponding to a captured Black piece, a captured White piece, or a captured empty cell, 
		 * respectively.
		*/
	}

}