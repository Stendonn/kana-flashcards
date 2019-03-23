import javax.swing.JFrame;

public class KanaFlashcards {

	
	public static void main(String[] args) {
		
		FlashcardScreen frame = new FlashcardScreen();


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640,480);
		frame.setVisible(true);
		frame.setResizable(true);

		if(frame.done() == true) {
			System.out.println("done");
		}
	}

}
