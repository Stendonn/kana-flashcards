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
		}else {
			throw new RuntimeException("done");
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
			kana += "��";
			break;
		case 1:
			kana += "��";
			break;
		case 2:
			kana += "��";
			break;
		case 3:
			kana += "��";
			break;
		case 4:
			kana += "��";
			break;
		//k
		case 5:
			kana += "��";
			break;
		case 6:
			kana += "��";
			break;
		case 7:
			kana += "��";
			break;
		case 8:
			kana += "��";
			break;
		case 9:
			kana += "��";
			break;
		//s
		case 10:
			kana += "��";
			break;
		case 11:
			kana += "��";
			break;
		case 12:
			kana += "��";
			break;
		case 13:
			kana += "��";
			break;
		case 14:
			kana += "��";
			break;
		//t
		case 15:
			kana += "��";
			break;
		case 16:
			kana += "��";
			break;
		case 17:
			kana += "��";
			break;
		case 18:
			kana += "��";
			break;
		case 19:
			kana += "��";
			break;
		//n
		case 20:
			kana += "��";
			break;
		case 21:
			kana += "��";
			break;
		case 22:
			kana += "��";
			break;
		case 23:
			kana += "��";
			break;
		case 24:
			kana += "��";
			break;
		//h
		case 25:
			kana += "��";
			break;
		case 26:
			kana += "��";
			break;
		case 27:
			kana += "��";
			break;
		case 28:
			kana += "��";
			break;
		case 29:
			kana += "��";
			break;

		//ma mi mu me mo
		case 30:
			kana += "��";
			break;
		case 31:
			kana += "��";
			break;
		case 32:
			kana += "��";
			break;
		case 33:
			kana += "��";
			break;
		case 34:
			kana += "��";
			break;
		//ya yu yo
		case 35:
			kana += "��";
			break;
		case 36:
			kana += "��";
			break;
		case 37:
			kana += "��";
			break;
		//ra ri ru re ro
			

		case 38:
			kana += "��";
			break;
		case 39:
			kana += "��";
			break;
		case 40:
			kana += "��";
			break;
		case 41:
			kana += "��";
			break;
		case 42:
			kana += "��";
			break;
		//wa wi we wo
			
		case 43:
			kana += "��";
			break;
		case 44:
			kana += "��";
			break;
		case 45:
			kana += "��";
			break;
		case 46:
			kana += "��";
			break;
		//n
		case 47:
			kana += "��";
			break;
	
		}
		
		
		return kana;
	}

	public static void main(String[] args) {
		
		KanaSymbol test = new KanaSymbol();
		System.out.println(test.digitToKana(5));
		
	}
	
}
