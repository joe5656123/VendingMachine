import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class VendingGUI extends JFrame {

    private JTextField jtfSelectionField;
    private JTextArea jtaCandyGet;



    public VendingGUI() {
		ImageIcon Doritos = new ImageIcon("X:\\My Documents\\GitHub\\VendingMachine\\src\\Images\\Doritos64.jpg");
		ImageIcon Hersheys = new ImageIcon("X:\\My Documents\\GitHub\\VendingMachine\\src\\Images\\Hersheys64.jpg");
		ImageIcon KitKat = new ImageIcon("X:\\My Documents\\GitHub\\VendingMachine\\src\\Images\\KitKat64.jpg");
		ImageIcon Lays = new ImageIcon("X:\\My Documents\\GitHub\\VendingMachine\\src\\Images\\Lays64.jpg");
		ImageIcon LifeSavers = new ImageIcon("X:\\My Documents\\GitHub\\VendingMachine\\src\\Images\\LifeSavers64.jpg");
		ImageIcon MilkyWay = new ImageIcon("X:\\My Documents\\GitHub\\VendingMachine\\src\\Images\\MilkyWay64.jpg");
		ImageIcon Reeses = new ImageIcon("X:\\My Documents\\GitHub\\VendingMachine\\src\\Images\\Reeses64.jpg");
		ImageIcon Snickers = new ImageIcon("X:\\My Documents\\GitHub\\VendingMachine\\src\\Images\\Snickers64.jpg");
		ImageIcon SunChips = new ImageIcon("X:\\My Documents\\GitHub\\VendingMachine\\src\\Images\\SunChips64.jpg");
//setting various visual features and buttons
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setResizable(false);
        setTitle("VENDING_MACHINE");
		setSize(340, 530);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //build image grid
					//JPanel jpItemDisplay = new JPanel(new FlowLayout(FlowLayout.LEFT, 3, 3));
					JPanel jpItemDisplay = new JPanel(new GridLayout(3, 4,3,3));
					jpItemDisplay.setBorder(new TitledBorder("Available Items"));
						//add images to grid as JLabels
						JLabel jlblDoritos = new JLabel(Doritos);
						jpItemDisplay.add(jlblDoritos);

						JLabel jlblHersheys = new JLabel(Hersheys);
						jpItemDisplay.add(jlblHersheys);

						JLabel jlblKitKat = new JLabel(KitKat);
						jpItemDisplay.add(jlblKitKat);

						JLabel jlblLays = new JLabel(Lays);
						jpItemDisplay.add(jlblLays);

						JLabel jlblLifeSavers = new JLabel(LifeSavers);
						jpItemDisplay.add(jlblLifeSavers);

						JLabel jlblMilkyWay = new JLabel(MilkyWay);
						jpItemDisplay.add(jlblMilkyWay);

						JLabel jlblReeses = new JLabel(Reeses);
						jpItemDisplay.add(jlblReeses);

						JLabel jlblSnickers = new JLabel(Snickers);
						jpItemDisplay.add(jlblSnickers);

						JLabel jlblSunChips = new JLabel(SunChips);
						jpItemDisplay.add(jlblSunChips);

		add(jpItemDisplay, BorderLayout.WEST);
		//Adding that drop spot at the bottom of a machine
		        JPanel jpCandySpot = new JPanel(new FlowLayout(FlowLayout.LEFT, 3, 3));
		        jtaCandyGet = new JTextArea(5, 20);
		        jtaCandyGet.setEditable(false);

		        jpCandySpot.add(jtaCandyGet);

        add(jpCandySpot, BorderLayout.PAGE_START);

        //build the selection panel, put at the top for visibility
        JPanel jpSelection = new JPanel(new FlowLayout(FlowLayout.LEFT, 3, 3));
        jpSelection.setBorder(new TitledBorder("Selection Goes Here"));

        jtfSelectionField = new JTextField(20);
        jtfSelectionField.setEditable(false);

        jpSelection.add(jtfSelectionField);
        add(jpSelection, BorderLayout.PAGE_START);
        //adding the interactable buttons in a grid via a loop.  Except for the last two buttons.
        JPanel jpButtons = new JPanel(new GridLayout(3, 4,3,3));
        jpButtons.setBorder(new TitledBorder("Please make a selection"));
        JButton[] buttonGrid = new JButton[10];

        for (int i = 1; i < buttonGrid.length; i++) {//this part was fun! /sarcasm
            buttonGrid[i] = new JButton(String.valueOf(i));
            jpButtons.add(buttonGrid[i]);
            buttonGrid[i].addActionListener(listener);
        }

        JButton jbtEnter = new JButton();
        JButton jbtQuit = new JButton();
        jbtQuit.setText("Clear");
        jbtEnter.setText("Enter");

        jpButtons.add(jbtEnter);//action listeners generated by netbeans, can change to make simpler if we need
        jbtEnter.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEnterActionPerformed(evt);
            }
        });

        jpButtons.add(jbtQuit);//action listeners generated by netbeans, can change to make simpler if we need
        jbtQuit.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtQuitActionPerformed(evt);
            }
        });

        add(jpButtons, BorderLayout.PAGE_START);





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

    private void jbtQuitActionPerformed(java.awt.event.ActionEvent evt) {
        jtfSelectionField.setText("");
    }

    private void jbtEnterActionPerformed(java.awt.event.ActionEvent evt) {
        //TODO:Code that links the selection program to the UI Frank pls
        jtaCandyGet.setText(jtfSelectionField.getText() + "CANDY YAY!"); //temp result
    }
//we can remove main, it was only used for testing purposes, if you want and just call the constructor in the main method
    public static void main(String[] args) {

        JFrame vendingWindow = new VendingGUI();
        vendingWindow.setVisible(true);

    }
}
