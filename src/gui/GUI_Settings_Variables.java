package gui;

import java.awt.Color;
import java.awt.Dimension;

public interface GUI_Settings_Variables extends GUI_FontSizeAdjustable {
	String strAppOfficialName = "Personal Expense Consultant";
	String strCopyRigts = "Copyright \u00a9 SPAM Team 2023";
	String strAboutApp = "This App is Capstone project of SPAM Team";

	int gui_width = 900;
	int gui_height = 500;
	Dimension mainGUIFrameSize = new Dimension(gui_width, gui_height);
	Dimension recordsGUIWindowFrameSize = new Dimension(gui_width, gui_height);

	String mainGUIFrameWindowTitle = strAppOfficialName;
	String recordsGUIWindowTitle = strAppOfficialName;

	Color allGuiBoxesBackgroundCColor = Color.BLUE;
	Color allGuiBoxesForegroundCColor = Color.BLACK;

}
