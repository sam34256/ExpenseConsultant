package src.gui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_BankInfoInputP  extends JPanel implements GUI_Settings_Variables{

	private static final long serialVersionUID = 1L;
	
	private JTextField jtfBankInfoIn1 = new JTextField();
	private JTextField jtfBankInfoIn2 = new JTextField();
	private JTextField jtfBankInfoIn3 = new JTextField();
	private JTextField jtfBankInfoIn4 = new JTextField();
	
	
	public GUI_BankInfoInputP() {
		setLayout(new GridLayout(5,1));
		JPanel box1 = new JPanel();
		box1.setLayout(new GridLayout(1,2));
		JPanel box2 = new JPanel();
		box2.setLayout(new GridLayout(1,2));
		JPanel box3 = new JPanel();
		box3.setLayout(new GridLayout(1,2));
		JPanel box4 = new JPanel();
		box4.setLayout(new GridLayout(1,2));
		
		
		box1.add(new JLabel("Bank Name:"));
		box1.add(jtfBankInfoIn1);
		box2.add(new JLabel("Bank Address:"));
		box2.add(jtfBankInfoIn2);
		box3.add(new JLabel("Bank Phone:"));
		box3.add(jtfBankInfoIn3);
		box4.add(new JLabel("Bank Routing Number:"));
		box4.add(jtfBankInfoIn4);
		
		add(new JLabel("New Bank Info:", JLabel.CENTER));
		add(box1);
		add(box2);
		add(box3);
		add(box4);
		
		
	}


	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}

}
