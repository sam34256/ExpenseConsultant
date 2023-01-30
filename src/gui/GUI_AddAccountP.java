package gui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUI_AddAccountP extends JPanel implements GUI_Settings_Variables {

	private static final long serialVersionUID = 1L;

	private JRadioButton jrbtAddAcctToExistingBank = new JRadioButton("Add New Account To Exist Bank");
	private JRadioButton jrbtAddAcctOfNewBank = new JRadioButton("Add New Account Of New Bank");

	public GUI_AddAccountP() {
		setLayout(new GridLayout(9, 1));
		ButtonGroup addAccntRBTNsGroup = new ButtonGroup();
		addAccntRBTNsGroup.add(jrbtAddAcctToExistingBank);
		addAccntRBTNsGroup.add(jrbtAddAcctOfNewBank);
		;

		add(new JLabel("Select Adding Accont Action To Perform"));
		add(jrbtAddAcctToExistingBank);
		add(jrbtAddAcctOfNewBank);

	}

	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}
}