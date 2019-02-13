/**
 * Kana Flashcards
 */

/**
 * @author Stendonn (Steven Nguyen)
 *
 */
//import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.Insets;

public class FlashcardScreen extends JFrame{
	
	//private JLabel kana;
	private JLabel kana;
	private JTextField answer;
	private JLabel test;
	private JTextField testbutton;
	
	
	public FlashcardScreen() {
		super("Kana Flashcards");
		setLocationRelativeTo(null);
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		c.gridwidth = 2;
		c.gridheight = 2;
		
		//kana = new JLabel("Hiragana");
		kana = new JLabel("Hiragana");
		answer = new JTextField(10);
		test = new JLabel("test");
		//testbutton = new JButton("lol");
		//change the font
		kana.setFont(new Font("Hiragana", Font.PLAIN, 28));
		
		//title
		c.anchor = GridBagConstraints.CENTER;
		//c.fill = GridBagConstraints.BOTH;
		c.weighty = 0.05;
		c.weightx = 0;
	    c.gridx = 0;
		c.gridy = 0;
		add(kana,c);
		
		//c.fill = GridBagConstraints.NONE;
		c.insets = new Insets(15, 200, 50, 200);
		c.weightx = 1;
		c.weighty = 0.1;
		c.gridx = 0;
		c.gridy = 2;
		add(test, c);
		
		
		//JTextfield
		//c.fill = GridBagConstraints.HORIZONTAL;
		//answer = new JTextField(5);
		answer.setFont(new Font("Hiragana", Font.PLAIN, 16));
		answer.setHorizontalAlignment(10);
		c.insets = new Insets(15, 230, 80, 230);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 4;
		c.anchor = GridBagConstraints.CENTER;
		add(answer,c);
		
		//testbutton
//		c.anchor = GridBagConstraints.CENTER;
//		c.fill = GridBagConstraints.HORIZONTAL;
//		c.gridx = 0;
//		c.gridy = 3;
//		add(testbutton, c);
		
		
		
	}
	
	


	public static void main(String[] args) {
		
		

	}

}
