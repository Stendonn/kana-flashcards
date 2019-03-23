
import java.util.HashMap;

public class KanaMap{
	
	private HashMap<String, String> map; 
	
	public KanaMap() {
		map = new HashMap<>();
		
		map.put("a", "‚ ");
		map.put("i", "‚¢");
		map.put("u", "‚¤");
		map.put("e", "‚¦");
		map.put("o", "‚¨");
		
		map.put("ka", "‚©");
		map.put("ki", "‚«");
		map.put("ku", "‚­");
		map.put("ke", "‚¯");
		map.put("ko", "‚±");
		
		map.put("sa", "‚³");
		map.put("shi", "‚µ");
		map.put("su", "‚·");
		map.put("se", "‚¹");
		map.put("so", "‚»");
		
		map.put("ta", "‚½");
		map.put("chi", "‚¿");
		map.put("tsu", "‚Â");
		map.put("te", "‚Ä");
		map.put("to", "‚Æ");
		
		map.put("na", "‚È");
		map.put("ni", "‚É");
		map.put("nu", "‚Ê");
		map.put("ne", "‚Ë");
		map.put("no", "‚Ì");
		
		map.put("ha", "‚Í");
		map.put("hi", "‚Ð");
		map.put("fu", "‚Ó");
		map.put("he", "‚Ö");
		map.put("ho", "‚Ù");
		
		map.put("ma", "‚Ü");
		map.put("mi", "‚Ý");
		map.put("mu", "‚Þ");
		map.put("me", "‚ß");
		map.put("mo", "‚à");
		
		map.put("ya", "‚â");
		map.put("yu", "‚ä");
		map.put("yo", "‚æ");
		
		map.put("ra", "‚ç");
		map.put("ri", "‚è");
		map.put("ru", "‚é");
		map.put("re", "‚ê");
		map.put("ro", "‚ë");
		
		map.put("wa", "‚í");
		map.put("wi", "‚î");
		map.put("we", "‚ï");
		map.put("wo", "‚ð");
		
		map.put("n", "‚ñ");
	}
	public String get(String key) {
		String retrieved = map.get(key);
		return retrieved;
	}
	public boolean isTruePair(String word, String symbol) {
		if (map.containsKey(word) && map.containsValue(symbol)) {
			if(map.get(word).equals(symbol)) {
				return true;
			}
		}
		return false;
	}
	


	public static void main(String[] args) {
		KanaMap test = new KanaMap();
		System.out.println(test.get("a"));
		String word = "no";
		String symbol = "‚Ì";
		System.out.println(test.isTruePair("ho", "lol"));

	}

}
