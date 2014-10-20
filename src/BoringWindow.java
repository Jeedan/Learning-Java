import java.awt.Container;

import javax.swing.*;

public class BoringWindow extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BoringWindow(){
		setTitle("THIS IS WHERE THE TITLE GOES OMG!");
		setSize(300, 200);
		setLocation(100, 200);
		setResizable(false);
		
		Panel613 panel = new Panel613();
		Container  cp = getContentPane();
		cp.add(panel);
		
	}

	public void CreateWindow(){
		JFrame frame = new BoringWindow();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
