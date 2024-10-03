import java.util.ArrayList;
import java.util.Scanner;

class GameMenu {

	private ArrayList<String> actions;

	public GameMenu(ArrayList<String> actions) {

		this.actions = actions;

	}

	public String getAction() {
		Scanner in = new Scanner(System.in);		
		System.out.println("Type a number to choose an action");
		
		for(String action : actions){
			System.out.println(action);
		}

		String choice = in.nextLine();
		return choice;

	}

}
