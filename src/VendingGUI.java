import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class VendingGUI extends JFrame {

	private ArrayList<ImageIcon> images;
    private JTextField jtfSelectionField;
    private JTextArea jtaCandyGet;
    private JPanel jpReturn;
    private JLabel jpImage;
    private Inventory inventory;

    public VendingGUI() {
		// Instansiate Inventory Object
		this.inventory = new Inventory();

		// Try to load the Inventory from the file, or just create new data
		// TODO: Implement loading
		// if file exists do something
		// else add items
		ArrayList<Item> items = inventory.getInventory();
		items.add(new Item(1.00, "Doritos"));
		items.add(new Item(1.25, "Hershey"));
		items.add(new Item(1.25, "Kit-Kat"));
		items.add(new Item(1.00, "Lays"));
		items.add(new Item(.75, "Life Savers"));
		items.add(new Item(1.25, "Milky Way"));
		items.add(new Item(1.25, "Recee's"));
		items.add(new Item(1.25, "Snickers"));
		items.add(new Item(1.00, "Sun Chips"));

		// Load ArrayList of ImageIcons, these are stored to reference later
		images = new ArrayList<ImageIcon>();
		for (int i = 1; i < 10; i++) {
			images.add(new ImageIcon("Images\\" + i + ".jpg"));
		}

		// Labels and Panels where the candy will drop
		jpReturn = new JPanel(new FlowLayout());
		jpReturn.setBorder(new TitledBorder("Get Candy"));
		jpImage = new JLabel(new ImageIcon("Images\\0.jpg"));
		jpImage.addMouseListener(new java.awt.event.MouseListener() {
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				// Simulate taking candy from JVM
				jpImage.setIcon(new ImageIcon("Images\\0.jpg"));
			}
		});
		jpReturn.add(jpImage);

		// Setting various visual features and buttons
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setResizable(false);
        setTitle("JVM");
        setSize(250, 575);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Build image grid
        // JPanel jpItemDisplay = new JPanel(new FlowLayout(FlowLayout.LEFT, 3, 3));
        JPanel jpItemDisplay = new JPanel(new GridLayout(3, 4, 3, 3));
        jpItemDisplay.setBorder(new TitledBorder("Inventory"));
        // Add images to grid as JLabels
        for (ImageIcon i : images) {
			jpItemDisplay.add(new JLabel(i));
		}
        add(jpItemDisplay, BorderLayout.WEST);

        // Adding that drop spot at the bottom of a machine
        JPanel jpCandySpot = new JPanel(new FlowLayout(FlowLayout.LEFT, 3, 3));
        add(jpCandySpot, BorderLayout.PAGE_START);

        // Build the selection panel, put at the top for visibility
        JPanel jpSelection = new JPanel(new FlowLayout(FlowLayout.LEFT, 3, 3));
        jpSelection.setBorder(new TitledBorder("Item Type"));

        jtfSelectionField = new JTextField(20);
        jtfSelectionField.setEditable(false);

        jpSelection.add(jtfSelectionField);
        add(jpSelection, BorderLayout.PAGE_START);

        // Adding the interactable buttons in a grid via a loop.  Except for the last two buttons.
        JPanel jpButtons = new JPanel(new GridLayout(4, 3, 3, 3));
        jpButtons.setBorder(new TitledBorder("Please make a selection"));
        JButton[] buttonGrid = new JButton[10];

        for (int i = 1; i < buttonGrid.length; i++) {
            buttonGrid[i] = new JButton(String.valueOf(i));
            jpButtons.add(buttonGrid[i]);
            buttonGrid[i].addActionListener(listener);
        }

        JButton jbtEnter = new JButton();
        JButton jbtQuit = new JButton();
        jbtQuit.setText("Clear");
        jbtEnter.setText("Enter");

        jpButtons.add(jbtEnter);
        jbtEnter.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jpImage.setIcon(images.get(Integer.parseInt(jtfSelectionField.getText().split("[)]")[0]) - 1));
			}
        });

        jpButtons.add(jbtQuit);
        jbtQuit.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSelectionField.setText("");
            }
        });
        add(jpButtons, BorderLayout.PAGE_START);
		jpCandySpot.add(jpReturn);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// OnExit Listener

			}
        });
    }
    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() instanceof JButton) {

                String text = ((JButton) e.getSource()).getText();
                Item item = inventory.getInventory().get(Integer.parseInt(text));
                jtfSelectionField.setText(String.format("%s) %s $%.2f, %d in stock", text, item.getName(), item.getPrice(), item.getInventory()));
            }
        }
    };

    public static void main(String[] args) {
        JFrame vendingWindow = new VendingGUI();
        vendingWindow.setVisible(true);
    }
}
