package src.gui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_AddAcctControlButtonsP extends JPanel implements GUI_Settings_Variables {

	private static final long serialVersionUID = 1L;
	
	private JButton jbtAddAccount = new JButton("Add");
	public GUI_AddAcctControlButtonsP() {
		setLayout(new GridLayout(5,1));
		add(new JLabel("Check Bank and Account"));
		add(new JLabel("Information"));
		add(new JLabel("if All Correct"));
		add(new JLabel("Click Add Button"));
		add(jbtAddAccount);
	}
	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}
}
