package gui.menu;


import java.awt.Component;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import gui.actios_processors.GUI_Menu_Actions;
import gui.automation.GUI_ElementCreator;
import gui.settings.GUI_Settings_Variables;
public class GUI_Menu extends JMenuBar implements GUI_Settings_Variables{
	private static final long serialVersionUID = 1L;
	private GUI_Menu_Actions a;
	public GUI_Menu(){
		setBackground(clrB_JMenuBar);
		setForeground(clrF_JMenuBar);
		setFont(GUI_ElementCreator.newFont(this.getFont(), txtSize_JMenuBar));
		a = new GUI_Menu_Actions();

		JMenu jmFile = GUI_ElementCreator.newJMenu("File");
		jmFile.setMnemonic('F');
		JMenuItem jmiSave = GUI_ElementCreator.newJMenuItem("Save");
		jmiSave.setMnemonic('v');
		jmFile.add(jmiSave);
		JMenuItem jmiLoad = GUI_ElementCreator.newJMenuItem("Load");
		jmiLoad.setMnemonic('L');
		jmFile.add(jmiLoad);
		jmFile.add(new JSeparator());
		JMenuItem jmiExit = GUI_ElementCreator.newJMenuItem("Exit");
		jmiExit.setMnemonic('E');
		jmFile.add(jmiExit);
		add(jmFile);
		jmiExit.addActionListener(a);


		JMenu jmSettings = GUI_ElementCreator.newJMenu("Settings");
		jmSettings.setMnemonic('S');
		JMenu jmView = GUI_ElementCreator.newJMenu("View");
		jmView.setMnemonic('V');
		JMenuItem jmiAddData = GUI_ElementCreator.newJMenuItem("Insert Data");
		jmiAddData.setMnemonic('I');
		jmView.add(jmiAddData);
		JMenuItem jmiSearchData = GUI_ElementCreator.newJMenuItem("Search Data");
		jmiSearchData.setMnemonic('r');
		jmView.add(jmiSearchData);
		JMenuItem jmiAdvising = GUI_ElementCreator.newJMenuItem("Advising");
		jmiAdvising.setMnemonic('d');
		jmView.add(jmiAdvising);
		JMenuItem jmiEditData = GUI_ElementCreator.newJMenuItem("Edit Data");
		jmiEditData.setMnemonic('E');
		jmView.add(jmiEditData);

		jmSettings.add(jmView);

		add(jmSettings);


		JMenu jmHelp = GUI_ElementCreator.newJMenu("Help");
		jmHelp.setMnemonic('H');
		JMenuItem jmiUse = GUI_ElementCreator.newJMenuItem("App Use");
		jmiUse.setMnemonic('U');
		jmHelp.add(jmiUse);
		jmHelp.add(new JSeparator());
		JMenuItem jmiAbout = GUI_ElementCreator.newJMenuItem("About");
		jmiAbout.setMnemonic('A');
		jmiAbout.addActionListener(a);
		jmHelp.add(jmiAbout);
		add(jmHelp);

		JMenu jmWindow = GUI_ElementCreator.newJMenu("GUI Windows Views");
		jmWindow.setMnemonic('W');
		JMenuItem jmiShowRecordsWindow = GUI_ElementCreator.newJMenuItem("Show Records Window");
		jmiShowRecordsWindow.setMnemonic('R');
		jmiShowRecordsWindow.addActionListener(a);
		jmWindow.add(jmiShowRecordsWindow);
		add(jmWindow);

		JMenu jmFontSize = GUI_ElementCreator.newJMenu("Adjust Text Size");
		jmFontSize.setMnemonic('T');
		jmFontSize.addActionListener(a);


		JMenuItem jmiIncreaseFontSize = GUI_ElementCreator.newJMenuItem("Increse GUI Text Size (+)");
		jmiIncreaseFontSize.setMnemonic('+');
		jmiIncreaseFontSize.addActionListener(a);
		JMenuItem jmiDecreaseFontSize = GUI_ElementCreator.newJMenuItem("Decrese GUI Text Size (-)");
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
