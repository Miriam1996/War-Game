public class War {
	Hand[] player;
	Deck d;
	int num_of_moves;
	Pile p[];

	public War() {
		player = new Hand[2];
		p = new Pile[2];
		for (int i = 0; i < 2; i++) {
			Hand h = new Hand();
			Pile p1 = new Pile();
			player[i] = h;
			p[i] = p1;
		}
		d = new Deck();
		num_of_moves = 0;

	}

	void PlayCard(Hand h, int player) {
		p[player].push(h.remove());

	}

	// checks which card is higher
	void round_winner() {
		while (!player[0].empty() && !player[1].empty() && p[0].peek().compareTo(p[1].peek()) == 0) {
			for (int i = 0; i < 2; i++) {
				num_of_moves += 2;
				PlayCard(player[i], i);
				PlayCard(player[i], i);
				PlayCard(player[i], i);
			}
		}
		if (p[0].peek().compareTo(p[1].peek()) > 0) {
			while (!p[0].empty())
				player[0].add(p[0].pop());
			while (!p[1].empty())
				player[0].add(p[0].pop());
		} else {
			while (!p[0].empty())
				player[1].add(p[0].pop());
			while (!p[1].empty())
				player[1].add(p[0].pop());

		}

	}

	void PlayWar() {
		try {
			d.shuffle();
			for (int i = 0; i < 2; i++)
				d.Deal(player[i], 26);
			while (!player[0].empty() && !player[1].empty()) {
				for (int i = 0; i < 2; i++) {
					num_of_moves++;
					PlayCard(player[i], i);
				}
				round_winner();

			}
			System.out.println(num_of_moves);

		} catch (NullPointerException npe) {
			System.out.println(npe.getMessage() + " " + num_of_moves);

		}
	}

}
