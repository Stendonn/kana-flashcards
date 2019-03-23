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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FlashcardScreen extends JFrame{
	
	//private JLabel kana;
	private JLabel kana;
	private JTextField answer;
	private KanaSymbol symbol;
	private GridBagConstraints c;
	private JLabel correctDisplay; 
	private int i;
	
	public FlashcardScreen() {
		super("Kana Flashcards");
		setLocationRelativeTo(null);
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
//		c.gridwidth = 3;
//		c.gridheight = 3;
		
		//kana = new JLabel("Hiragana");
		kana = new JLabel("Hiragana");
		answer = new JTextField();
		symbol = new KanaSymbol();
		symbol.setText("Press Enter to Begin!");
		//testbutton = new JButton("lol");
		//change the font
		kana.setFont(new Font("Hiragana", Font.PLAIN, 28));
		symbol.setFont(new Font("blank", Font.BOLD, 40));
		
		//title

		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 50 ,0);
		
		add(kana,c);
		//displaying symbol
		c.insets = new Insets(0, 0, 100, 0);
		c.gridx = 0;
		c.gridy = 1;

		c.anchor = GridBagConstraints.CENTER;
		add(symbol,c);
		

		// correctDisplay
		
		correctDisplay = new JLabel("Good luck!");
		
		//c.anchor = GridBagConstraints.LINE_END;
		//c.fill = GridBagConstraints.VERTICAL;
		//c.ipadx = 40;
		c.insets = new Insets(0, 0, 50, 0);
		c.gridx = 0;
		c.gridy = 2;
		add(correctDisplay, c);
		
		//JTextfield
		

		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		answer.addActionListener(new TextboxListener());
		add(answer,c);

		
		
	}
	public boolean done() {
		if (i == 48) {
			return true;
		}
		else {
			return false;
		}
	}
	//Listeners
	private class TextboxListener implements ActionListener, KeyListener{
		public void actionPerformed(ActionEvent ev) {


			String input = answer.getText();

			KanaMap map = new KanaMap();

			if(map.isTruePair(input, symbol.getSymbol()) == true) {
				correctDisplay.setText("Correct!");
			}
			else {
				if(i == 0) {
					correctDisplay.setText("Good Luck!");
				}
				else {	
					correctDisplay.setText("Incorrect!");
				}
			}

			symbol.setRandomSymbol();

			
			symbol.setText(symbol.getSymbol());
			
			//System.out.println(i);
			answer.setText("");
			i++;

		}
		public void keyPressed(KeyEvent e) {

		}
		@Override
		public void keyReleased(KeyEvent e) {
			
		}
		@Override
		public void keyTyped(KeyEvent e) {
		
		}
	}


	public static void main(String[] args) {
		
		

	}

}
