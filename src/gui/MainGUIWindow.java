package src.gui;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class MainGUIWindow extends JFrame implements GUI_Settings_Variables {
	private static final long serialVersionUID = 1L;
	public MainGUIWindow() {
		

		setJMenuBar(new GUI_Menu(this));
		setTitle(strAppOfficialName);
		setSize(mainGUIFrameSize);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setLayout(new BorderLayout());
		
		
		
		
		add(new GUI_MainBoxP(), BorderLayout.CENTER);
		
		add(new JLabel(strCopyRigts, JLabel.CENTER), BorderLayout.SOUTH);
		setVisible(true);
	}
	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}
	

}

