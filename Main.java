public class Main{
	
	public static void main(String[] args){
		int[] table = new int[20];
		
		for(int i = 0; i < table.length; i++){
			table[i] = (int)Math.round(Math.random() * 10);
		}
		
		System.out.println(Tableaux.fouilleSeq(table, 5));;
	}
	
}
