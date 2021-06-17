/**
 * The main part doing the calculations based on former labs.
 * 
 * @author	jonasblome
 * @author	n-c0de-r &
 * @version	17.06.21
 */

public class SetEngine {
	
	private Set<Character> res;
	
	public SetEngine() {
		res = new Set<>();
	}
	
	public String union(String setA, String setB) {
		Set<Character> A = toSet(setA);
		Set<Character> B = toSet(setB);
		res = A.union(B);
		return res.toString();
	}
	
	public String intersection(String setA, String setB) {
		return "";
	}
	
	public String subtraction(String setA, String setB) {
		return "";
	}
	
	public String length(String set) {
		return "";
	}
	
	private Set<Character> toSet(String str) {
		Set<Character> set = new Set<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ',' && str.charAt(i) != ' ') {
			set.add(str.charAt(i));
			}
		}
		return set;
	}

	/**
	 * @return The title of this calculation engine.
	 */
	public String getTitle() {
		return "Set Calculator";
	}
}
