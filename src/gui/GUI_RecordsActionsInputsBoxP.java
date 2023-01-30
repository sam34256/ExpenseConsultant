package gui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_RecordsActionsInputsBoxP extends JPanel implements GUI_Settings_Variables {

	private static final long serialVersionUID = 1L;

	private JTextField jtfRecordsSearchIn1 = new JTextField();
	private JTextField jtfRecordsSearchIn2 = new JTextField();
	private JTextField jtfRecordsSearchIn3 = new JTextField();

	public GUI_RecordsActionsInputsBoxP() {
		setLayout(new GridLayout(4, 1));
		JPanel jpBox1 = new JPanel();
		jpBox1.setLayout(new GridLayout(1, 2));
		JPanel jpBox2 = new JPanel();
		jpBox2.setLayout(new GridLayout(1, 2));
		JPanel jpBox3 = new JPanel();
		jpBox3.setLayout(new GridLayout(1, 2));
		JPanel jpBox4 = new JPanel();
		jpBox4.setLayout(new GridLayout(1, 2));

		add(new JLabel("Enter Parameters of Your Record Search"));

		jpBox1.add(new JLabel("Search Parameter 1"));
		jpBox1.add(jtfRecordsSearchIn1);
		add(jpBox1);
		jpBox2.add(new JLabel("Search Parameter 2"));
		jpBox2.add(jtfRecordsSearchIn2);
		add(jpBox3);
		jpBox3.add(new JLabel("Search Parameter 3"));
		jpBox3.add(jtfRecordsSearchIn3);
		add(jpBox3);

	}

	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}
}