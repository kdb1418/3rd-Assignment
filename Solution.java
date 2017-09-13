class Sports {
	String getName() {
		return "Generic Sports";
	}
	void getNumberOfTeamMerbers() {
		System.out.println("Each team has n players in "+getName());
	}
}
class Soccer extends Sports{
	@Override
	String getName() {
		return "Soccer Class";
	}
	@Override
	void getNumberOfTeamMerbers() {
		System.out.println("Each team has 11 players in "+getName());
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports c1 = new Sports();
		Soccer c2 = new Soccer();
		System.out.println(c1.getName());
		c1.getNumberOfTeamMerbers();
		System.out.println(c2.getName());
		c2.getNumberOfTeamMerbers();
	}

}
