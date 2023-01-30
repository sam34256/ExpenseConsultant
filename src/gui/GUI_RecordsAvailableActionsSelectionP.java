package gui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUI_RecordsAvailableActionsSelectionP extends JPanel implements GUI_Settings_Variables {

	private static final long serialVersionUID = 1L;

	private JRadioButton jrbtInsertRecord = new JRadioButton("Insert Record");
	private JRadioButton jrbtSearchRecord = new JRadioButton("Search Record");

	public GUI_RecordsAvailableActionsSelectionP() {
		setLayout(new GridLayout(3, 1));
		ButtonGroup actionRBTNsGroup = new ButtonGroup();
		actionRBTNsGroup.add(jrbtInsertRecord);
		actionRBTNsGroup.add(jrbtSearchRecord);

		add(new JLabel("Available Actions:"));
		add(jrbtInsertRecord);
		add(jrbtSearchRecord);

	}

	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}
}