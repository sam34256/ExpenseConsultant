package gui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_RecordsActionsControlButtonsBoxP extends JPanel implements GUI_Settings_Variables {

	private static final long serialVersionUID = 1L;

	private JButton jbtSearchRecords = new JButton("Search");

	public GUI_RecordsActionsControlButtonsBoxP() {
		setLayout(new GridLayout(2, 1));
		add(new JLabel("Click Search Button to Perform Search"));
		add(jbtSearchRecords);
	}

	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}
}
