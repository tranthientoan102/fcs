//==================================
// Foundations of Computer Science
// Student: Thien Toan Tran
// id: a1808080
// Semester: 1
// Year: 2020
// Practical Exam Number: Final
//===================================

import java.util.ArrayList;
public class Club {

	/**
	 * members of club
	 */
	ArrayList<Player> members = new ArrayList<>();

	/**
	 * add new member to club
	 * @param member new member
	 */
	public void addMember(Player member){
		members.add(member);
	}

	/**
	 * remove member by id
	 * @param id id of removing member
	 * @return true if successfully remove; otherwise false
	 */
	public boolean removeMemberById(int id){
		// init result in case expecting id is not found
		boolean result = false;

		// scan all club members
		for (Player player : members){
			if (player.getId() == id){
				// found member with expecting id
				members.remove(player);
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * get member has highest ranking in the club
	 * @return member has highest ranking
	 */
	public Player getHighestRankedPlayer(){
		Player theOne = members.get(0);

		// scan among the members
		for (Player player : members) {
			if (player.getRanking() >= theOne.getRanking()) {
				// find new high
				theOne = player;
			}
		}
		return theOne;
	}

	/**
	 * print information of club's memebers
	 */
	public void printMembers() {
		String result = "";
		for (Player player : members) {
			result += player.toString() + "\n";
		}
		System.out.println(result);
	}


}
