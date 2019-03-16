
public class KanaHashTable{
	//48 symbols
	//0 - a
	//1 - i
	//etc.
	
	private int Symbols[];
	
	public KanaHashTable() {
		
		Symbols = new int[48];
		
		for(int i = 0; i < 48; i++) {
			Symbols[i] = 1;
		}
	}
	
	public int check(int index) {
		
		return Symbols[index];
	}
	public void uncheck(int index) {
		Symbols[index] = 0;
	}
	public int size() {
		int size = 0;
		for(int i = 0; i < 48;i++) {
			if(Symbols[i] == 1) {
				size++;
			}
		}
		return size;
	}

	public static void main(String[] args) {
		
		KanaHashTable lol = new KanaHashTable();
		
		for(int i = 0; i < 48; i++) {
			System.out.println(lol.check(i));
		}
		
	}

}

