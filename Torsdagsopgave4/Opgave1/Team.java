import java.util.ArrayList;

class Team {

	private String name;
	private int rank;
	private ArrayList<String> playerName = new ArrayList<>();
	
	public Team(String name) {
		
		this.name = name;
	
	}


	public void setRank(int newRank) {

		rank = newRank;

	}


	public void addPlayer(String player) {

		playerName.add(player);
	}


	public String toString() {

		return "Hold: " + this.name + " " + "Rang: " + rank + " " + "player: " + playerName;

	}

}