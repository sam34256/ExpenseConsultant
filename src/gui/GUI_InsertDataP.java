package gui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUI_InsertDataP extends JPanel implements GUI_Settings_Variables {

	private static final long serialVersionUID = 1L;

	private JRadioButton jrbtNewBank = new JRadioButton("New Bank");
	private JRadioButton jrbtAccount = new JRadioButton("Account");
	private JRadioButton jrbtRecord = new JRadioButton("Transaction Record");
	private JRadioButton jrbtRecurrentExpense = new JRadioButton("Recurrent Expense");
	private JRadioButton jrbtRecurrentProfit = new JRadioButton("Recurrent Profit");

	public GUI_InsertDataP() {
		setLayout(new GridLayout(6, 1));
		ButtonGroup actionRBTNsGroup = new ButtonGroup();
		actionRBTNsGroup.add(jrbtNewBank);
		actionRBTNsGroup.add(jrbtAccount);
		actionRBTNsGroup.add(jrbtRecord);
		actionRBTNsGroup.add(jrbtRecurrentExpense);
		actionRBTNsGroup.add(jrbtRecurrentProfit);

		add(new JLabel("Select What you Want to Insert"));
		add(jrbtNewBank);
		add(jrbtAccount);
		add(jrbtRecord);
		add(jrbtRecurrentExpense);
		add(jrbtRecurrentProfit);
	}

	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}
}
