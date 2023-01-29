package src.gui;


import java.awt.Component;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
public class GUI_Menu extends JMenuBar implements GUI_Settings_Variables{
	private static final long serialVersionUID = 1L;
	private GUI_Menu_Actions a;
	public GUI_Menu(){
		
		a = new GUI_Menu_Actions();
		
		JMenu jmFile = new JMenu("File");
		jmFile.setMnemonic('F');	
		JMenuItem jmiSave = new JMenuItem("Save");
		jmiSave.setMnemonic('v');
		jmFile.add(jmiSave);
		JMenuItem jmiLoad = new JMenuItem("Load");
		jmiLoad.setMnemonic('L');
		jmFile.add(jmiLoad);
		jmFile.add(new JSeparator());
		JMenuItem jmiExit = new JMenuItem("Exit");
		jmiExit.setMnemonic('E');
		jmFile.add(jmiExit);
		add(jmFile);
		jmiExit.addActionListener(a);
		
		
		JMenu jmSettings = new JMenu("Settings");
		jmSettings.setMnemonic('S');	
		JMenu jmView = new JMenu("View");
		jmView.setMnemonic('V');
		JMenuItem jmiAddData = new JMenuItem("Insert Data");
		jmiAddData.setMnemonic('I');
		jmView.add(jmiAddData);
		JMenuItem jmiSearchData = new JMenuItem("Search Data");
		jmiSearchData.setMnemonic('r');
		jmView.add(jmiSearchData);
		JMenuItem jmiAdvising = new JMenuItem("Advising");
		jmiAdvising.setMnemonic('d');
		jmView.add(jmiAdvising);
		JMenuItem jmiEditData = new JMenuItem("Edit Data");
		jmiEditData.setMnemonic('E');
		jmView.add(jmiEditData);

		jmSettings.add(jmView);
		
		add(jmSettings);
		
		
		JMenu jmHelp = new JMenu("Help");
		jmHelp.setMnemonic('H');
		JMenuItem jmiUse = new JMenuItem("App Use");
		jmiUse.setMnemonic('U');
		jmHelp.add(jmiUse);
		jmHelp.add(new JSeparator());
		JMenuItem jmiAbout = new JMenuItem("About");
		jmiAbout.setMnemonic('A');
		jmiAbout.addActionListener(a);
		jmHelp.add(jmiAbout);	
		add(jmHelp);
		
		JMenu jmWindow = new JMenu("GUI Windows Views");
		jmWindow.setMnemonic('W');
		JMenuItem jmiShowRecordsWindow = new JMenuItem("Show Records Window");
		jmiShowRecordsWindow.setMnemonic('R');
		jmiShowRecordsWindow.addActionListener(a);
		jmWindow.add(jmiShowRecordsWindow);
		add(jmWindow);
		
		JMenu jmFontSize = new JMenu("Adjust Text Size");
		jmFontSize.setMnemonic('T');
		jmFontSize.addActionListener(a);

		
		JMenuItem jmiIncreaseFontSize = new JMenuItem("Increse GUI Text Size (+)");
		jmiIncreaseFontSize.setMnemonic('+');
		jmiIncreaseFontSize.addActionListener(a);
		JMenuItem jmiDecreaseFontSize = new JMenuItem("Decrese GUI Text Size (-)");
		jmiDecreaseFontSize.setMnemonic('-');
		jmiDecreaseFontSize.addActionListener(a);
		jmFontSize.add(jmiIncreaseFontSize);
		jmFontSize.add(jmiDecreaseFontSize);
		
		add(jmFontSize);
	}
	public GUI_Menu(Component mainGUIWindow) {
		this();
		a.setMainGUIComponent(mainGUIWindow);
	}
}
