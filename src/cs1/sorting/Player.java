package cs1.sorting;
import java.io.Serializable;

public class Player implements Serializable, Comparable<Player> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6021544019100045257L;

	public String getFirstName() {
		return firstName;
	}

	public String getTeam() {
		return team;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNumber() {
		return number;
	}

	public int getAtBats() {
		return atBats;
	}

	public int getHits() {
		return hits;
	}

	public int getHomeRuns() {
		return homeRuns;
	}

	public boolean isFreeAgent() {
		return freeAgent;
	}
	private String firstName = "";
	
	private String team = "";
	private String lastName = "";
	private String number = "";
	private int atBats = 0;
	private int hits = 0;
	private int homeRuns = 0;
	private boolean freeAgent = false;
	
	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", team=" + team + ", lastName=" + lastName + ", number=" + number
				+ ", atBats=" + atBats + ", hits=" + hits + ", homeRuns=" + homeRuns + ", freeAgent=" + freeAgent + "]";
	}

	public Player(String firstName, String lastName, String number, int atBats, int hits, int homeRuns, String team) {
		super();
		this.firstName = firstName;
		this.team = team;
		this.lastName = lastName;
		this.number = number;
		this.atBats = atBats;
		this.hits = hits;
		this.homeRuns = homeRuns;
	}

	public Player(String firstName, String lastName, String number, int atBats, int hits, int homeRuns) {
		super();
		this.firstName = firstName;
		this.team = "";
		this.lastName = lastName;
		this.number = number;
		this.atBats = atBats;
		this.hits = hits;
		this.homeRuns = homeRuns;
	}

	public double battingAverage()
	{
		if(atBats == 0)
		{
			return 0;
		}
		return (double)hits / atBats;
		
	}
	@Override
	public int compareTo(Player o) {
		
		return (int)((100) * (this.battingAverage() - o.battingAverage()));
	}
}
