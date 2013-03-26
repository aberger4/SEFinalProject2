import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GameGUIPanel extends JFrame{

	private StartPanel start;

	/**
	Constructor
	**/
	public GameGUIPanel(){

		start = new StartPanel();

		setLayout(new BorderLayout());


		add(start, BorderLayout.CENTER);

		// Display a title.
        setTitle("Rat-A-Tat-Cat");
		
      	// Specify an action for the close button.
      	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      	//Pack contents of window and display it.
		pack();
		setVisible(true);

	}//End constructor	



}