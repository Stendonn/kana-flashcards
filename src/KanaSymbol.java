import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;

public class KanaSymbol extends JLabel{

	private String symbol;
	private KanaHashTable symbolList;
	
	public KanaSymbol() {
		symbolList = new KanaHashTable();
	}
	public String getSymbol() {
		return symbol;
	}
	public void setRandomSymbol() {
		Random rand = new Random();
		int symbolDigit = Math.abs(rand.nextInt() % 48);
		int temp;

		if(symbolList.size() != 0) {
			while(symbolList.check(symbolDigit) == 0) {
				symbolDigit++;
				if(symbolDigit == 48) {
					symbolDigit = 0;
				}
			}
		}
		//1 use of each symbol
		else {

			//throw new RuntimeException("done");
		}
		
		//System.out.println(symbolDigit);
		symbol = digitToKana(symbolDigit);
		setText(symbol);
		
		symbolList.uncheck(symbolDigit);

	}
	public boolean isEmpty() {
		if(symbolList.size() == 0) {
			return true;
		}
		return false;
	}
	public String digitToKana(int digit) {
		
		String kana = "";
		
		switch(digit) {
		case 0:
			kana += "あ";
			break;
		case 1:
			kana += "い";
			break;
		case 2:
			kana += "う";
			break;
		case 3:
			kana += "え";
			break;
		case 4:
			kana += "お";
			break;
		//k
		case 5:
			kana += "か";
			break;
		case 6:
			kana += "き";
			break;
		case 7:
			kana += "く";
			break;
		case 8:
			kana += "け";
			break;
		case 9:
			kana += "こ";
			break;
		//s
		case 10:
			kana += "さ";
			break;
		case 11:
			kana += "し";
			break;
		case 12:
			kana += "す";
			break;
		case 13:
			kana += "せ";
			break;
		case 14:
			kana += "そ";
			break;
		//t
		case 15:
			kana += "た";
			break;
		case 16:
			kana += "ち";
			break;
		case 17:
			kana += "つ";
			break;
		case 18:
			kana += "て";
			break;
		case 19:
			kana += "と";
			break;
		//n
		case 20:
			kana += "な";
			break;
		case 21:
			kana += "に";
			break;
		case 22:
			kana += "ぬ";
			break;
		case 23:
			kana += "ね";
			break;
		case 24:
			kana += "の";
			break;
		//h
		case 25:
			kana += "は";
			break;
		case 26:
			kana += "ひ";
			break;
		case 27:
			kana += "ふ";
			break;
		case 28:
			kana += "へ";
			break;
		case 29:
			kana += "ほ";
			break;

		//ma mi mu me mo
		case 30:
			kana += "ま";
			break;
		case 31:
			kana += "み";
			break;
		case 32:
			kana += "む";
			break;
		case 33:
			kana += "め";
			break;
		case 34:
			kana += "も";
			break;
		//ya yu yo
		case 35:
			kana += "や";
			break;
		case 36:
			kana += "ゆ";
			break;
		case 37:
			kana += "よ";
			break;
		//ra ri ru re ro
			

		case 38:
			kana += "ら";
			break;
		case 39:
			kana += "り";
			break;
		case 40:
			kana += "る";
			break;
		case 41:
			kana += "れ";
			break;
		case 42:
			kana += "ろ";
			break;
		//wa wi we wo
			
		case 43:
			kana += "わ";
			break;
		case 44:
			kana += "ゐ";
			break;
		case 45:
			kana += "ゑ";
			break;
		case 46:
			kana += "を";
			break;
		//n
		case 47:
			kana += "ん";
			break;
	
		}
		
		
		return kana;
	}

	public static void main(String[] args) {
		
		KanaSymbol test = new KanaSymbol();
		System.out.println(test.digitToKana(5));
		
	}
	
}
