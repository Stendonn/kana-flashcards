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
	private JTextField testbutton;
	private GridBagConstraints c;
	
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
		symbol.setText("whoa");
		//testbutton = new JButton("lol");
		//change the font
		kana.setFont(new Font("Hiragana", Font.PLAIN, 28));
		symbol.setFont(new Font("blank", Font.BOLD, 40));
		
		//title
		//c.fill = GridBagConstraints.HORIZONTAL;
		//c.weightx = 0.5;
		//c.weighty = 0.5;
		//c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 50 ,0);
		
		add(kana,c);
//		c.anchor = GridBagConstraints.CENTER;
		//c.fill = GridBagConstraints.BOTH;
//		c.weighty = 0.05;
//		c.weightx = 0;
//	    c.gridx = 0;
//		c.gridy = 0;
//		add(kana,c);
		//c.fill = GridBagConstraints.NONE;
		//question
		//c.fill = GridBagConstraints.NONE;
//		c.insets = new Insets(15, 200, 50, 200);
//		c.weightx = 1;
//		c.weighty = 0.1;
//		c.gridx = 0;
//		c.gridy = 2;
//		add(test, c);
		c.insets = new Insets(0, 0, 100, 0);
		c.gridx = 0;
		c.gridy = 1;
		//c.anchor = GridBagConstraints.CENTER;
		//c.ipadx = 100;
		c.anchor = GridBagConstraints.CENTER;
		add(symbol,c);
		//JTextfield
		
		//c.fill = GridBagConstraints.HORIZONTAL;
		//answer = new JTextField(5);
//		answer.setFont(new Font("Hiragana", Font.PLAIN, 16));
//		answer.setHorizontalAlignment(10);
//		c.insets = new Insets(15, 230, 80, 230);
//		c.fill = GridBagConstraints.BOTH;
		//c.ipadx = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
//		c.anchor = GridBagConstraints.CENTER;
		answer.addActionListener(new TextboxListener());
		add(answer,c);
		
		//testbutton
//		c.anchor = GridBagConstraints.CENTER;
//		c.fill = GridBagConstraints.HORIZONTAL;
//		c.gridx = 0;
//		c.gridy = 3;
//		add(testbutton, c);
		
		//actionlistener
		

		
		
	}
	//Listeners
	private class TextboxListener implements ActionListener, KeyListener{
		public void actionPerformed(ActionEvent ev) {

			String input = answer.getText();
			System.out.println(input);
			symbol.setRandomSymbol();
			if(symbol.isEmpty()) {
				throw new RuntimeException("end");
			}
			System.out.println(symbol.getSymbol());
			symbol.setText(symbol.getSymbol());
			answer.setText("");
		}
		public void keyPressed(KeyEvent e) {
//			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
//				//System.out.println("lol");
//				//test.setText("loll");
//				//add(test,c);
//			}
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
