import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JTextField name1;
  JTextField name2;

  JButton rock1;
  JButton paper1;
  JButton scissors1;

  JButton rock2;
  JButton paper2;
  JButton scissors2;

  JTextArea outputArea;
  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
    // initialize the main JPanel
   mainPanel = new JPanel();
   // turn on the manual layouts
   mainPanel.setLayout(null);
   // add the panel to the JFrame to see it
   frame.add(mainPanel);

   // initialize the JTextFields
   name1 = new JTextField("Please enter a name:");
   name2 = new JTextField("Please enter a name:");
   // set the location and size of the input fields
   name1.setBounds(200, 10, 180, 25);
   name2.setBounds(400, 10, 180, 25);
   // add the inputs to the main panel
   mainPanel.add(name1);
   mainPanel.add(name2);

   // initialize the JButtons
   rock1 = new JButton("Rock");
   rock2 = new JButton("Rock");
   paper1 = new JButton("Paper");
   paper2 = new JButton("Paper");
   scissors1 = new JButton("Scissors");
   scissors2 = new JButton("Scissors");
   // set the location and size of the buttons
   rock1.setBounds(217, 50, 150, 35);
   rock2.setBounds(417, 50, 150, 35);
   paper1.setBounds(217, 100, 150, 35);
   paper2.setBounds(417, 100, 150, 35);
   scissors1.setBounds(217, 150, 150, 35);
   scissors2.setBounds(417, 150, 150, 35);
   // add the actionListener to the buttons
   rock1.addActionListener(this);
   rock2.addActionListener(this); 
   paper1.addActionListener(this);
   paper2.addActionListener(this);
   scissors1.addActionListener(this);
   scissors2.addActionListener(this);
   // give each button an actionCommand
   rock1.setActionCommand("rock1");
   rock2.setActionCommand("rock2");
   paper1.setActionCommand("paper1");
   paper2.setActionCommand("paper2");
   scissors1.setActionCommand("scissors1");
   scissors2.setActionCommand("scissors2");
   // add the buttons to the main panel
   mainPanel.add(rock1);
   mainPanel.add(rock2);
   mainPanel.add(paper1);
   mainPanel.add(paper2);
   mainPanel.add(scissors1);
   mainPanel.add(scissors2);
   
   // initialize the JButton
   outputArea = new JTextArea();
   // set the location and size of the button
   outputArea.setBounds(300, 200, 200, 35);
   // disable the textArea so that the user can't type
   outputArea.setEnabled(false);
   // add the buttons to the main panel
   mainPanel.add(outputArea);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
