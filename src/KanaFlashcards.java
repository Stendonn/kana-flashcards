import javax.swing.JFrame;

public class KanaFlashcards {

	
	public static void main(String[] args) {
		
		Flashcards frame = new Flashcards();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.resize(640,480);
		frame.setVisible(true);
		frame.setResizable(false);
		

	}

}
