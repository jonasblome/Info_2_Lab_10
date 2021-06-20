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
	
	/**
	 * Constructor of the SetEngine class.
	 */
	public SetEngine() {
		res = new Set<>();
		A = new Set<>();
		B = new Set<>();
	}
	
	/**
	 * Unites two given Sets to a new Set.
	 * 
	 * @param setA	The main set.
	 * @param setB	The second set to merge to the first.
	 * @return	Resulting Set merged from the given two.
	 */
	public String union(String setA, String setB) {
		A = toSet(setA);
		B = toSet(setB);
		res = A.union(B);
		return res.toString();
	}
	
	/**
	 * Intersects two given Sets to a new Set.
	 * 
	 * @param setA	The main set.
	 * @param setB	The second set to check for intersection with the first.
	 * @return	Resulting Set of intersecting from the given two.
	 */
	public String intersection(String setA, String setB) {
		A = toSet(setA);
		B = toSet(setB);
		res = A.intersection(B);
		return res.toString();
	}
	
	/**
	 * Subtracts one Set from another.
	 * 
	 * @param setA	The main set.
	 * @param setB	The second set to subtract from the first.
	 * @return	Resulting Set of subtracting from the given two.
	 */
	public String subtraction(String setA, String setB) {
		A = toSet(setA);
		B = toSet(setB);
		res = A.subtraction(B);
		return res.toString();
	}
	
	/**
	 * Getter method to return the number of elements of a Set.
	 * 
	 * @param set	Given Set to check the number of elements.
	 * @return	String containing the number of elements of a Set.
	 */
	public String length(String set) {
		A = toSet(set);
		int len = A.length();
		return Integer.toString(len);
	}
	
	/**
	 * Setter method to turn given Strings to a Set
	 * 
	 * @param str	String to be converted.
	 * @return	Resulting Set of Characters of the input String.
	 */
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
