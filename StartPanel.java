import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;

//This class builds the start screen panel, which allows the user to select a difficulty and enter their 
//name and begin the game.

public class StartPanel extends JPanel{
	
	private JPanel name;
	private JPanel difficulty;
	private JPanel startButton;
	private JTextField nameField;

	 

/**
Builds the start screen panel
**/
	public StartPanel(){

		setLayout(new GridLayout(3,1));

		//Name Panel goes on top
		buildNamePanel();
		add(name);

		//Difficulty is in center
		buildStartButtonPanel();
		add(difficulty);

		//Start button stays at bottom of window
		buildStartButtonPanel();
		add(startButton);

	}	

	private void buildNamePanel(){

		name = new JPanel();
		nameField = new JTextField();
		nameField.setColumns(20);
   		add(nameField);


	}

	private void buildDifficultyPanel(){


	}

	private void buildStartButtonPanel(){


	}

	public String getUsersName(){
		
		String userName = nameField.getText();
		// if(username = "")
			// Add functionality to check if username is null
		return userName;
	}


}