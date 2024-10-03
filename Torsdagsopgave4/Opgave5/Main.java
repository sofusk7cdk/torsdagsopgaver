import java.util.ArrayList;

class Main {

	public static void main(String[] args) {

		ArrayList<String> actions = new ArrayList<>();

		actions.add("Start game");
 		actions.add("Resume game");
 		actions.add("Pause game");
 		actions.add("End game");
	
		GameMenu gameMenu = new GameMenu(actions);

		String userChoice = gameMenu.getAction();

		int action = Integer.parseInt(userChoice);
		doAction(action);

	}

	public static void doAction(int action) {

		switch(action) {
  			case 1:
    				System.out.println("Starting the game now");
    				break;
  			case 2:
    				System.out.println("Fetching previously saved game data");
    				break;
			case 3:
				System.out.println("Game paused");
				break;
			case 4:
				System.out.println("Ending game");
				break;
  			default:
    				System.out.println("Not in range");
				break;
		}


	}


}