import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * GUI for the calculator, based on the former labs.
 * 
 * @author	jonasblome
 * @author	n-c0de-r 
 * @version	17.06.2021
 */
public class SetGUI implements ActionListener {

	private SetEngine calc;
	private JFrame frame;
	private JTextField setA;
	private JTextField setB;
	private JTextField result;

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

		JPanel inputPanel = new JPanel(new GridLayout(2, 1));
		
		setA = new JTextField();
		inputPanel.add(setA, BorderLayout.NORTH);
		setB = new JTextField();
		inputPanel.add(setB, BorderLayout.SOUTH);
		
		contentPane.add(inputPanel, BorderLayout.NORTH);
		
		JPanel buttonPanel = new JPanel(new GridLayout(2, 3));

		addButton(buttonPanel, "Union");
		addButton(buttonPanel, "Intersection");
		addButton(buttonPanel, "Subtraction");

		addButton(buttonPanel, "Length Set A");
		addButton(buttonPanel, "Length Set B");
		addButton(buttonPanel, "Clear Fields");

		contentPane.add(buttonPanel, BorderLayout.CENTER);
		
		result = new JTextField();
		contentPane.add(result, BorderLayout.SOUTH);
		result.setEditable(false);

		frame.pack();
	}

	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		if (command.equals("Union")) {
			result.setText(calc.union(setA.getText(), setB.getText()));
		} else if (command.equals("Intersection")) {
			calc.intersection(setA.getText(), setB.getText());
		} else if (command.equals("Subtraction")) {
			calc.subtraction(setA.getText(), setB.getText());
		} else if (command.equals("Length Set A")) {
			result.setText(calc.length(setA.getText()));
		} else if (command.equals("Length Set B")) {
			result.setText(calc.length(setB.getText()));
		} else if (command.equals("Clear Fields")) {
			clear();
		}
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
	
	private void clear() {
		setA.setText("");
		setB.setText("");
		result.setText("");
	}
}
