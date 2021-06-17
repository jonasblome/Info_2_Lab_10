import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * GUI for the calculator, based on the former labs.
 * 
 * @author	___ & n-c0de-r 
 * @version	17.06.2021
 */
public class SetGUI implements ActionListener {

	private SetEngine calc;
	private JFrame frame;
	private JTextField display;

	public SetGUI(SetEngine engine) {
		calc = engine;
		makeFrame();
		frame.setVisible(true);
	}

	/**
	 * Set the visibility of the interface.
	 * 
	 * @param visible true if the interface is to be made visible, false otherwise.
	 */
	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}

	private void makeFrame() {
		frame = new JFrame(calc.getTitle());

		JPanel contentPane = (JPanel) frame.getContentPane();
		contentPane.setLayout(new BorderLayout(8, 8));
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

		display = new JTextField();
		contentPane.add(display, BorderLayout.NORTH);
		display.setEditable(false);

		JPanel buttonPanel = new JPanel(new GridLayout(4, 6));

		addButton(buttonPanel, "7");
		addButton(buttonPanel, "8");
		addButton(buttonPanel, "9");
		buttonPanel.add(new JLabel(" "));
		addButton(buttonPanel, "(");
		addButton(buttonPanel, ")");

		addButton(buttonPanel, "4");
		addButton(buttonPanel, "5");
		addButton(buttonPanel, "6");
		buttonPanel.add(new JLabel(" "));
		addButton(buttonPanel, "*");
		addButton(buttonPanel, "/");

		addButton(buttonPanel, "1");
		addButton(buttonPanel, "2");
		addButton(buttonPanel, "3");
		buttonPanel.add(new JLabel(" "));
		addButton(buttonPanel, "+");
		addButton(buttonPanel, "-");

		addButton(buttonPanel, "0");
		buttonPanel.add(new JLabel(" "));
		buttonPanel.add(new JLabel(" "));
		addButton(buttonPanel, "del");
		buttonPanel.add(new JLabel(" "));
		addButton(buttonPanel, "=");

		contentPane.add(buttonPanel, BorderLayout.CENTER);

		frame.pack();
	}

	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		if (command.equals("=")) {
			calc.equals();
		} else if (command.equals("del")) {
			calc.clear();
		} else {
			calc.buttonPressed(command);
		}
		redisplay();
	}

	/**
	 * Add a button to the button panel.
	 * 
	 * @param panel      The panel to receive the button.
	 * @param buttonText The text for the button.
	 */
	protected void addButton(Container panel, String buttonText) {
		JButton button = new JButton(buttonText);
		button.addActionListener(this);
		panel.add(button);
	}

	// Change (int) displayValue to Hex (String) and capitalizes the letter
	private void redisplay() {
		display.setText("" + calc.getDisplayString().toUpperCase());
	}
}