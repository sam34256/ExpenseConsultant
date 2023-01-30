package gui;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;

public class GUI_RecordsFrame extends JFrame implements GUI_Settings_Variables {

	private static final long serialVersionUID = 1L;

	public GUI_RecordsFrame() {
		setJMenuBar(new GUI_Menu(this));
		setTitle(recordsGUIWindowTitle);
		setSize(recordsGUIWindowFrameSize);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		add(new GUI_RecordsBoxP(), BorderLayout.CENTER);

		setVisible(true);
	}

	@Override
	public Component getComponent() {
		// TODO Auto-generated method stub
		return this;
	}
}
