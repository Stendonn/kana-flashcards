
import java.util.HashMap;

public class KanaMap{
	
	private HashMap<String, String> map; 
	
	public KanaMap() {
		map = new HashMap<>();
		
		map.put("a", "あ");
		map.put("i", "い");
		map.put("u", "う");
		map.put("e", "え");
		map.put("o", "お");
		
		map.put("ka", "か");
		map.put("ki", "き");
		map.put("ku", "く");
		map.put("ke", "け");
		map.put("ko", "こ");
		
		map.put("sa", "さ");
		map.put("shi", "し");
		map.put("su", "す");
		map.put("se", "せ");
		map.put("so", "そ");
		
		map.put("ta", "た");
		map.put("chi", "ち");
		map.put("tsu", "つ");
		map.put("te", "て");
		map.put("to", "と");
		
		map.put("na", "な");
		map.put("ni", "に");
		map.put("nu", "ぬ");
		map.put("ne", "ね");
		map.put("no", "の");
		
		map.put("ha", "は");
		map.put("hi", "ひ");
		map.put("fu", "ふ");
		map.put("he", "へ");
		map.put("ho", "ほ");
		
		map.put("ma", "ま");
		map.put("mi", "み");
		map.put("mu", "む");
		map.put("me", "め");
		map.put("mo", "も");
		
		map.put("ya", "や");
		map.put("yu", "ゆ");
		map.put("yo", "よ");
		
		map.put("ra", "ら");
		map.put("ri", "り");
		map.put("ru", "る");
		map.put("re", "れ");
		map.put("ro", "ろ");
		
		map.put("wa", "わ");
		map.put("wi", "ゐ");
		map.put("we", "ゑ");
		map.put("wo", "を");
		
		map.put("n", "ん");
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
		String symbol = "の";
		System.out.println(test.isTruePair("ho", "lol"));

	}

}
