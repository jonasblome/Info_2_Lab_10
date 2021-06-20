/**
 * The runner class of a calculator.
 * Based on earlier calculator versions.
 * 
 * @author	jonasblome
 * @author	n-c0de-r
 * @version	17.06.2021
 */

public class SetCalculator {
	private SetEngine engine;
	private SetGUI gui;

	/**
	 * Create a new calculator and show it.
	 */
	public SetCalculator() {
		engine = new SetEngine();
		gui = new SetGUI(engine);
	}

	/**
	 * In case the window was closed, show it again.
	 */
	public void show() {
		gui.setVisible(true);
	}

	public static void main(String[] args) {
		SetCalculator c = new SetCalculator();
	}
}
