
import java.util.HashMap;

public class KanaMap{
	
	private HashMap<String, String> map; 
	
	public KanaMap() {
		map = new HashMap<>();
		
		map.put("a", "��");
		map.put("i", "��");
		map.put("u", "��");
		map.put("e", "��");
		map.put("o", "��");
		
		map.put("ka", "��");
		map.put("ki", "��");
		map.put("ku", "��");
		map.put("ke", "��");
		map.put("ko", "��");
		
		map.put("sa", "��");
		map.put("shi", "��");
		map.put("su", "��");
		map.put("se", "��");
		map.put("so", "��");
		
		map.put("ta", "��");
		map.put("chi", "��");
		map.put("tsu", "��");
		map.put("te", "��");
		map.put("to", "��");
		
		map.put("na", "��");
		map.put("ni", "��");
		map.put("nu", "��");
		map.put("ne", "��");
		map.put("no", "��");
		
		map.put("ha", "��");
		map.put("hi", "��");
		map.put("fu", "��");
		map.put("he", "��");
		map.put("ho", "��");
		
		map.put("ma", "��");
		map.put("mi", "��");
		map.put("mu", "��");
		map.put("me", "��");
		map.put("mo", "��");
		
		map.put("ya", "��");
		map.put("yu", "��");
		map.put("yo", "��");
		
		map.put("ra", "��");
		map.put("ri", "��");
		map.put("ru", "��");
		map.put("re", "��");
		map.put("ro", "��");
		
		map.put("wa", "��");
		map.put("wi", "��");
		map.put("we", "��");
		map.put("wo", "��");
		
		map.put("n", "��");
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
		String symbol = "��";
		System.out.println(test.isTruePair("ho", "lol"));

	}

}
