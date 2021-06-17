/**
 * The main part doing the calculations based on former labs.
 * 
 * @author	jonasblome
 * @author	n-c0de-r &
 * @version	17.06.21
 */

public class SetEngine {

	private Set<Character> A;
	private Set<Character> B;	
	private Set<Character> res;
	
	public SetEngine() {
		res = new Set<>();
		A = new Set<>();
		B = new Set<>();
	}
	
	public String union(String setA, String setB) {
		A = toSet(setA);
		B = toSet(setB);
		res = A.union(B);
		return res.toString();
	}
	
	public String intersection(String setA, String setB) {
		A = toSet(setA);
		B = toSet(setB);
		res = A.intersection(B);
		return res.toString();
	}
	
	public String subtraction(String setA, String setB) {
		A = toSet(setA);
		B = toSet(setB);
		res = A.subtraction(B);
		return res.toString();
	}
	
	public String length(String set) {
		A = toSet(set);
		int len = A.length();
		return Integer.toString(len);
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
}
