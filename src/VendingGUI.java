import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class vendingGUI extends JFrame{
private JTextField jtfSelectionField;
private JTextArea jtaCandyGet;

	public vendingGUI() {
		setLayout(new FlowLayout(FlowLayout.LEFT));

	     //build the selection panel, put at the top for visibility
	     JPanel jpSelection = new JPanel(new FlowLayout(FlowLayout.LEFT,3,3));
		        jpSelection.setBorder(new TitledBorder("Please enter digits"));

		        jtfSelectionField = new JTextField(20);
		 	    jtfSelectionField.setEditable(false);

		 	   jpSelection.add(jtfSelectionField);
		  add(jpSelection,BorderLayout.PAGE_START);
	     //adding the interactable buttons in a grid via a loop.  Except for the last two buttons.
	    JPanel jpButtons = new JPanel(new GridLayout(3,4));
        jpButtons.setBorder(new TitledBorder("Please make a selection"));
        JButton[] buttonGrid = new JButton[10];

				for(int i = 0; i < buttonGrid.length; i++ ) {//this part was fun! /sarcasm
				  buttonGrid[i] = new JButton(String.valueOf(i));
				  jpButtons.add(buttonGrid[i]);
				  buttonGrid[i].addActionListener(listener);
				}

		JButton jbtEnter = new JButton();
		JButton jbtQuit = new JButton();
		jbtQuit.setText("Quit");
		jbtEnter.setText("Enter");

		jpButtons.add(jbtEnter);//action listeners generated by netbeans, can change to make simpler if we need
		jbtEnter.addActionListener(new java.awt.event.ActionListener() {

			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			                jbtEnterActionPerformed(evt);
			            }
        	 });


		jpButtons.add(jbtQuit);//action listeners generated by netbeans, can change to make simpler if we need
		jbtQuit.addActionListener(new java.awt.event.ActionListener() {
			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			                jbtQuitActionPerformed(evt);
			            }
        	 });


		add(jpButtons,BorderLayout.PAGE_START);

		//Adding that drop spot at the bottom of a machine
		JPanel jpCandySpot = new JPanel (new FlowLayout (FlowLayout.LEFT,3,3));
		jtaCandyGet = new JTextArea(5,20);
		jtaCandyGet.setEditable(false);

		jpCandySpot.add(jtaCandyGet);

		add(jpCandySpot, BorderLayout.PAGE_START);






	}//The following ActionListeners were NOT generated by netbeans
		ActionListener listener = new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            if (e.getSource() instanceof JButton) {
		                String text = ((JButton) e.getSource()).getText();
		                jtfSelectionField.setText(text);
		            }
		        }
    		};
 private void jbtQuitActionPerformed(java.awt.event.ActionEvent evt){
	 this.dispose();
 }
  private void jbtEnterActionPerformed(java.awt.event.ActionEvent evt){
 	 //TODO:Code that links the selection program to the UI
 	 jtaCandyGet.setText("CANDY YAY!"); //temp result
 }



public static void main (String[] args){
	JFrame vendingWindow = new vendingGUI();
	       vendingWindow.setTitle("VENDING_MACHINE");
	       vendingWindow.setSize(340,330);
	       vendingWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           vendingWindow.setVisible(true);
}
}
