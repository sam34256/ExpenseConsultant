package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class GUI_RecordsBoxP extends JPanel implements GUI_Settings_Variables {

	private static final long serialVersionUID = 1L;

	private JLabel jlblRecordsMainTitle = new JLabel("Records Main Title", JLabel.CENTER);
	private JLabel jlblRecordsSubTitle = new JLabel("Records Sub Title", JLabel.CENTER);
	private String[] columnNames = { "T-Rec Num", "T-Explain", "T-Bank", "T-Acct #", "T-Amount" };
	private String[][] testData = { { "Rec Num", "Explain", "Bank", "Acct #", "Amount" },
			{ "Rec Num", "Explain", "Bank", "Acct #", "Amount" }, { "Rec Num", "Explain", "Bank", "Acct #", "Amount" },
			{ "Rec Num", "Explain", "Bank", "Acct #", "Amount" }, { "Rec Num", "Explain", "Bank", "Acct #", "Amount" },
			{ "Rec Num", "Explain", "Bank", "Acct #", "Amount" },
			{ "Rec Num", "Explain", "Bank", "Acct #", "Amount" } };
	private JTable jtRecordsTable = new JTable(testData, columnNames);

	public GUI_RecordsBoxP() {
		setLayout(new BorderLayout());

		JPanel jpRecordsTitleBoxP = new JPanel();
		JPanel jpRecordsDisplayBoxP = new JPanel();
		JPanel jpRecordsActionControlsBoxP = new JPanel();
		JPanel jpRecordsDisplayAndActionBoxP = new JPanel();

		jpRecordsTitleBoxP.setLayout(new GridLayout(2, 1));
		jpRecordsTitleBoxP.add(jlblRecordsMainTitle);
		jpRecordsTitleBoxP.add(jlblRecordsSubTitle);

		jpRecordsDisplayBoxP.setLayout(new BorderLayout());
		jpRecordsDisplayBoxP.add(jtRecordsTable.getTableHeader(), BorderLayout.PAGE_START);
		jpRecordsDisplayBoxP.add(jtRecordsTable, BorderLayout.CENTER);

		jpRecordsActionControlsBoxP.setLayout(new GridLayout(1, 3));
		jpRecordsActionControlsBoxP.add(new GUI_RecordsAvailableActionsSelectionP());
		jpRecordsActionControlsBoxP.add(new GUI_RecordsActionsInputsBoxP());

		jpRecordsActionControlsBoxP.add(new GUI_RecordsActionsControlButtonsBoxP());

		add(jpRecordsTitleBoxP, BorderLayout.NORTH);
		add(jpRecordsDisplayBoxP, BorderLayout.CENTER);
		add(jpRecordsActionControlsBoxP, BorderLayout.SOUTH);

//		TableView tv = new TableView(testData);
	}

	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}
}
