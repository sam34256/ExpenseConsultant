package gui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUI_AvailableActionsSelectionP extends JPanel implements GUI_Settings_Variables {

	private static final long serialVersionUID = 1L;

	private JRadioButton jrbtInsertData = new JRadioButton("Insert Data");
	private JRadioButton jrbtSearchData = new JRadioButton("Search Data");
	private JRadioButton jrbtGetAdvice = new JRadioButton("Get Advice");
	private JRadioButton jrbtHowToUse = new JRadioButton("Learn How to Use");
	private JRadioButton jrbtSaveData = new JRadioButton("Save Data");
	private JRadioButton jrbtLoadData = new JRadioButton("Load Data");
	private JRadioButton jrbtObtainDataReport = new JRadioButton("Obtain Data Report");

	public GUI_AvailableActionsSelectionP() {
		setLayout(new GridLayout(9, 1));
		ButtonGroup actionRBTNsGroup = new ButtonGroup();
		actionRBTNsGroup.add(jrbtInsertData);
		actionRBTNsGroup.add(jrbtSearchData);
		actionRBTNsGroup.add(jrbtGetAdvice);
		actionRBTNsGroup.add(jrbtHowToUse);
		actionRBTNsGroup.add(jrbtSaveData);
		actionRBTNsGroup.add(jrbtLoadData);
		actionRBTNsGroup.add(jrbtObtainDataReport);

		add(new JLabel("Available Actions:"));
		add(jrbtInsertData);
		add(jrbtSearchData);
		add(jrbtGetAdvice);
		add(jrbtHowToUse);
		add(jrbtSaveData);
		add(jrbtLoadData);
		add(jrbtObtainDataReport);

	}

	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}
}
