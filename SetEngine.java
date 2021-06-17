/**
 * The main part doing the calculations based on former labs.
 * 
 * @author	___ & n-c0de-r &
 * @version	17.06.21
 */

public class SetEngine {
	private String displayString = "";
	private Postfix postfix;

	public SetEngine() {
		postfix = new Postfix();
	}

	/**
	 * @return The string that should be calculated by postfix.
	 */
	public String getDisplayString() {
		return displayString;
	}

	/**
	 * Extend the string to evaluate
	 * 
	 * @param number The number pressed on the calculator.
	 */
	public void buttonPressed(String number) {
		displayString = displayString + number;
		displayString += " ";
	}

	/**
	 * Calculate the new set
	 */
	public void equals() {
//		if (displayString != null) {
//			String pfx = postfix.infixToPostfix(displayString);
//			if (mode == 10) {
//				displayString = "" + postfix.evaluate(pfx);
//			} else {
//				// Cast Doubles to integer, as hex can't calculate doubles anyways!
//				displayString = "" + Integer.toHexString((int) (postfix.evaluate(pfx)));
//			}
//		}
	}

	/**
	 * The 'del' (delete) button was pressed. Clear the input string.
	 */
	public void clear() {
		displayString = "";
	}

	/**
	 * @return The title of this calculation engine.
	 */
	public String getTitle() {
		return "Set Calculator";
	}
}