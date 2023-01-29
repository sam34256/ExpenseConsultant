package src.gui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;

public interface GUI_FontSizeAdjustable {

		
	public Component getComponent();
	

	public default void defaultAllElementsFont() {
//		defaultJButtonsFont();
//		defaultJCBOsFont();
//		defaultJLabelsFont();
//		defaultJTFsFont();
//		defaultJTAreaFont();
	}
	public default void decreaseAllElementsFont() {
		if(getComponent()!=null)
			decreaseAllElementsFont(getComponent());
	}
	public default void increaseAllElementsFont() {
		if(getComponent()!=null)
			increaseAllElementsFont(getComponent());
	}
	public default void increaseAllElementsFont(Component c) {
		
		if(((Container)c).getComponentCount()>0){
			for(Component children: ((Container) c).getComponents()) {
				increaseAllElementsFont(children);
			}
		}	
		Font f = c.getFont();
		c.setFont(new Font(f.getName(), f.getStyle(), f.getSize()+1));	
		
	}
	public default void decreaseAllElementsFont(Component c) {
		
		if(((Container)c).getComponentCount()>0){
			for(Component children: ((Container) c).getComponents()) {
				decreaseAllElementsFont(children);
			}
		}	
		Font f = c.getFont();
		c.setFont(new Font(f.getName(), f.getStyle(), f.getSize()-1));	
		
	}
	public default void decreaseFont(Component c, String element) {
		if(((Container)c).getComponentCount()>0){
			for(Component children: ((Container) c).getComponents()) {
				decreaseFont(children, element);
			}
		}	
		if(c.getClass().getSimpleName().compareToIgnoreCase(element)==0) {
			c.setFont(new Font(c.getFont().getFontName(), c.getFont().getStyle(), c.getFont().getSize()-1));	
			
		}
	}
	public default void increaseFont(Component c, String element) {
		if(((Container)c).getComponentCount()>0){
			for(Component children: ((Container) c).getComponents()) {
				increaseFont(children, element);
			}
		}	
		if(c.getClass().getSimpleName().compareToIgnoreCase(element)==0) {
			c.setFont(new Font(c.getFont().getFontName(), c.getFont().getStyle(), c.getFont().getSize()+1));	
			
		}
	}
}





