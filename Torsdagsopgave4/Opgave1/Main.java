class Main {

	public static void main(String[] args) {

		Team t1 = new Team("Team 1");
		Team t2 = new Team("Team 2");
		Team t3 = new Team("Team 3");
		Team t4 = new Team("Team 4");
		Team t5 = new Team("Team 5");

		t1.setRank(10);
		t2.setRank(10);
		t3.setRank(10);
		t4.setRank(10);
		t5.setRank(10);

		t1.addPlayer("Player 1");
		t2.addPlayer("Player 2");
		t3.addPlayer("Player 3");
		t4.addPlayer("Player 4");
		t5.addPlayer("Player 5");

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);

	}
}