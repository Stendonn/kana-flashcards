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
import javax.swing.SwingConstants;

public class Flashcards extends JFrame{
	
	private JLabel kana;
	
	public Flashcards() {
		super("Kana Flashcards");
		setLocationRelativeTo(null);
		
		kana = new JLabel("Hiragana", SwingConstants.CENTER);
		//change the font
		kana.setFont(new Font("Hiragana", Font.PLAIN, 28));
		kana.setVerticalAlignment(SwingConstants.TOP);
		
		add(kana);
		
		
	}
	
	


	public static void main(String[] args) {
		
		

	}

}
