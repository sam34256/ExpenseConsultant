package gui;

import java.awt.Component;

public interface GUI_VisualCdddustomizable extends GUI_Settings_Variables {
	default void setVisualSettings(Component c) {
		c.setBackground(allGuiBoxesBackgroundCColor);
		c.setForeground(allGuiBoxesForegroundCColor);
	}

}
