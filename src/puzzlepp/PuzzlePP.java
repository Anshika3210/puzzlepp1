package puzzlepp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PuzzlePP extends Frame implements ActionListener {
    JFrame Frame;
    JLabel l1, Heading;                                // l1 is used to set image.
    Button b1, b2, b3, b4, b5, b6, b7, b8,b9;        // b1,b2,b3,b4,b5,b6,b7,b8,b9 are the buttons that are used to write 1,2,3,upto 8
    JButton Back, Help ,Score;
    int iScore = 0;

    // This is a constructor.
    PuzzlePP() {
        // Create the main JFrame for the puzzle game
        Frame = new JFrame("Puzzle Game");
        Frame.setBackground(Color.WHITE);
        Frame.setLayout(null);
        Frame.setSize(700, 525);
        Frame.setLocation(700, 525);
        Frame.setVisible(true);
        Frame.setResizable(false);
        // Create a background label to display an image
        l1 = new JLabel();
        l1.setBounds(0, 0, 700, 525);
        l1.setLayout(null);
        // Load and set the background image
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("puzzlepp/icons/Puzzle1.jpg"));
        Image i1 = img.getImage().getScaledInstance(700, 525, Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(i1);
        l1.setIcon(img1);
        // Create and configure the game title label
        Heading = new JLabel("PUZZLE GAME");
        Heading.setBounds(150, 50, 1000, 50);
        Heading.setFont(new Font("Arial", Font.BOLD, 50));
        Heading.setForeground(Color.WHITE);
        l1.add(Heading);
        Frame.add(l1);
        // button to restart the game.
        Back = new JButton("RESTART");
        Back.setFont(new Font("Monospaced", Font.BOLD, 20));
        Back.setBounds(90, 390, 150, 50);
        Back.setBackground(Color.WHITE);
        Back.setForeground(Color.BLACK);
        l1.add(Back);
        // button to show the score.
        Score = new JButton("MY SCORE");
        Score.setFont(new Font("Monospaced", Font.BOLD, 20));
        Score.setBounds(250, 390, 150, 50);
        Score.setBackground(Color.WHITE);
        Score.setForeground(Color.BLACK);
        l1.add(Score);
        // button for help.
        Help = new JButton("HELP");
        Help.setFont(new Font("Monospaced", Font.BOLD, 20));
        Help.setBounds(410, 390, 150, 50);
        Help.setBackground(Color.WHITE);
        Help.setForeground(Color.BLACK);
        l1.add(Help);
        // Create buttons for the puzzle grid (b1 to b9) and set their positions
        b1 = new Button("1");
        b1.setBounds(190, 130, 70, 70);
        l1.add(b1);
        b2 = new Button("2");
        b2.setBounds(280, 130, 70, 70);
        l1.add(b2);
        b3 = new Button("3");
        b3.setBounds(370, 130, 70, 70);
        l1.add(b3);
        b4 = new Button("4");
        b4.setBounds(190, 210, 70, 70);
        l1.add(b4);
        b5 = new Button("5");
        b5.setBounds(280, 210, 70, 70);
        l1.add(b5);
        b6 = new Button("6");
        b6.setBounds(370, 210, 70, 70);
        l1.add(b6);
        b7 = new Button("7");
        b7.setBounds(190, 290, 70, 70);
        l1.add(b7);
        b8 = new Button("");
        b8.setBounds(280, 290, 70, 70);
        l1.add(b8);
        b9 = new Button("8");
        b9.setBounds(370, 290, 70, 70);
        l1.add(b9);
        //// Attach the same action listener (this) to the buttons for handling clicks
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        Back.addActionListener(this);
        Help.addActionListener(this);
        Score.addActionListener(this);
    }
    //The actionPerformed method is a method defined in the ActionListener interface in Java. It is used to handle action events, such as button clicks, in graphical user interfaces (GUI) frameworks like Java Swing and AWT.
    public void actionPerformed(ActionEvent e) {
        // Check which button was clicked based on the event source
        if (e.getSource() == b1) {
            String label = b1.getLabel();
            // Check if the label can be moved to adjacent buttons
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b1.setLabel("");
            }
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b1.setLabel("");
            }
        }
        if (e.getSource() == b2) {
            String label = b2.getLabel();
            if (b1.getLabel().equals("")) {
                b1.setLabel(label);
                b2.setLabel("");
            }
            if (b3.getLabel().equals("")) {
                b3.setLabel(label);
                b2.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b2.setLabel("");
            }
        }
        if (e.getSource() == b3) {
            String label = b3.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b3.setLabel("");
            }
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b3.setLabel("");
            }
        }
        if (e.getSource() == b4) {
            String label = b4.getLabel();
            if (b1.getLabel().equals("")) {
                b1.setLabel(label);
                b4.setLabel("");
            }
            if (b7.getLabel().equals("")) {
                b7.setLabel(label);
                b4.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b4.setLabel("");
            }
        }
        if (e.getSource() == b5) {
            String label = b5.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b5.setLabel("");
            }
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b5.setLabel("");
            }
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b5.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b5.setLabel("");
            }
        }
        if (e.getSource() == b6) {
            String label = b6.getLabel();
            if (b9.getLabel().equals("")) {
                b9.setLabel(label);
                b6.setLabel("");
            }
            if (b3.getLabel().equals("")) {
                b3.setLabel(label);
                b6.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b6.setLabel("");
            }
        }
        if (e.getSource() == b7) {
            String label = b7.getLabel();
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b7.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b7.setLabel("");
            }
        }
        if (e.getSource() == b8) {
            String label = b8.getLabel();
            if (b9.getLabel().equals("")) {
                b9.setLabel(label);
                b8.setLabel("");
            }
            if (b7.getLabel().equals("")) {
                b7.setLabel(label);
                b8.setLabel("");
            }
            if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b8.setLabel("");
            }
        }
        if (e.getSource() == b9) {
            String label = b9.getLabel();
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b9.setLabel("");
            }
            if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b9.setLabel("");
            }
        }
        //Restart Button : Restart the game.
        if (e.getSource() == Back) {
            b1.setLabel("6");
            b2.setLabel("7");
            b3.setLabel("2");
            b4.setLabel("5");
            b5.setLabel("");
            b6.setLabel("1");
            b7.setLabel("8");
            b8.setLabel("3");
            b9.setLabel("4");
        }
        //Help button : helps the user to figure out what the game is about.
        if (e.getSource() == Help) {
            JOptionPane.showMessageDialog(this, "This is a Puzzle game."
                    + " In this you have to place numbers from 1-8 to their right poition."
                    + " By clicking on the number it will move to the empty slot adjacent to it.");

        }
        //congrats code : if user sucessfully arranges the number in order it will show a essage box saying congratulation.
        if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel()
                .equals("3") && b4.getLabel().equals("4") && b5.getLabel().equals("5")
                && b6.getLabel().equals("6") && b7.getLabel().equals("7") && b8.getLabel()
                .equals("8") && b9.getLabel().equals("")) {
            JOptionPane.showMessageDialog(this, "Congratulations! You won.");
            iScore++;
            b1.setLabel("2");
            b2.setLabel("4");
            b3.setLabel("6");
            b4.setLabel("8");
            b5.setLabel("");
            b6.setLabel("1");
            b7.setLabel("3");
            b8.setLabel("5");
            b9.setLabel("7");
        }
        //Score button : This will show users score.
        if (e.getSource() == Score) {
            JOptionPane.showMessageDialog(this, "Your current Score is " + iScore + ".");
        }
    }
    //This is the main function.
    public static void main(String[] args) {
        new PuzzlePP();
    }
}