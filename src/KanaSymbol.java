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
			kana += "‚ ";
			break;
		case 1:
			kana += "‚¢";
			break;
		case 2:
			kana += "‚¤";
			break;
		case 3:
			kana += "‚¦";
			break;
		case 4:
			kana += "‚¨";
			break;
		//k
		case 5:
			kana += "‚©";
			break;
		case 6:
			kana += "‚«";
			break;
		case 7:
			kana += "‚­";
			break;
		case 8:
			kana += "‚¯";
			break;
		case 9:
			kana += "‚±";
			break;
		//s
		case 10:
			kana += "‚³";
			break;
		case 11:
			kana += "‚µ";
			break;
		case 12:
			kana += "‚·";
			break;
		case 13:
			kana += "‚¹";
			break;
		case 14:
			kana += "‚»";
			break;
		//t
		case 15:
			kana += "‚½";
			break;
		case 16:
			kana += "‚¿";
			break;
		case 17:
			kana += "‚Â";
			break;
		case 18:
			kana += "‚Ä";
			break;
		case 19:
			kana += "‚Æ";
			break;
		//n
		case 20:
			kana += "‚È";
			break;
		case 21:
			kana += "‚É";
			break;
		case 22:
			kana += "‚Ê";
			break;
		case 23:
			kana += "‚Ë";
			break;
		case 24:
			kana += "‚Ì";
			break;
		//h
		case 25:
			kana += "‚Í";
			break;
		case 26:
			kana += "‚Ð";
			break;
		case 27:
			kana += "‚Ó";
			break;
		case 28:
			kana += "‚Ö";
			break;
		case 29:
			kana += "‚Ù";
			break;

		//ma mi mu me mo
		case 30:
			kana += "‚Ü";
			break;
		case 31:
			kana += "‚Ý";
			break;
		case 32:
			kana += "‚Þ";
			break;
		case 33:
			kana += "‚ß";
			break;
		case 34:
			kana += "‚à";
			break;
		//ya yu yo
		case 35:
			kana += "‚â";
			break;
		case 36:
			kana += "‚ä";
			break;
		case 37:
			kana += "‚æ";
			break;
		//ra ri ru re ro
			

		case 38:
			kana += "‚ç";
			break;
		case 39:
			kana += "‚è";
			break;
		case 40:
			kana += "‚é";
			break;
		case 41:
			kana += "‚ê";
			break;
		case 42:
			kana += "‚ë";
			break;
		//wa wi we wo
			
		case 43:
			kana += "‚í";
			break;
		case 44:
			kana += "‚î";
			break;
		case 45:
			kana += "‚ï";
			break;
		case 46:
			kana += "‚ð";
			break;
		//n
		case 47:
			kana += "‚ñ";
			break;
	
		}
		
		
		return kana;
	}

	public static void main(String[] args) {
		
		KanaSymbol test = new KanaSymbol();
		System.out.println(test.digitToKana(5));
		
	}
	
}
