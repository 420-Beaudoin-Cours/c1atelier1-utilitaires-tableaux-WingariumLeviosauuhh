import javafx.scene.control.Tab;
import org.junit.Test;
import sample.Tableaux;

import static org.junit.Assert.*;

public class TableauxTest{
	
	@Test
	public void trierCroissantSSS(){
		int[] tab = {-30,142,12,413,41,4,34,1,4,134,1,4};
		int[] tabRes = {-30,1,1,4,4,4,12,34,41,134,142,413};
		
		Tableaux.trierCroissantSSS(tab);
		
		assertArrayEquals(tabRes, tab);
	}
	
	@Test
	public void testTrierCroissantSSS(){
		//Meme fonction que le precedent, sauf en string
		String[] tab = {"-30","142","12","413","41","4","34","1","4","134","1","4"};
		String[] tabRes = {"-30","1","1","4","4","4","12","34","41","134","142","413"};
		
		Tableaux.trierCroissantSSS(tab);
		
		assertArrayEquals(tabRes, tab);
	}
	
	@Test
	public void trierDecroissantSSS(){
		String[] tab = {"-25","35","105","1010"};
		String[] tabRes = {"1010","105","35","-25"};
		
		Tableaux.trierDecroissantSSS(tab);
		
		assertArrayEquals(tabRes, tab);
	}
	
	@Test
	public void maximum(){
		int[] tab = {1,2,3};
		int max = 3;
		
		assertEquals(max, Tableaux.maximum(tab));
	}
	
	@Test
	public void minimum(){
		int[] tab = {123,313,1323,124,31,4,134,134,1,231,23,12,312,3};
		int min = 1;
		
		assertEquals(min, Tableaux.minimum(tab));
	}
	
	@Test
	public void moyenne(){
		int[] tab = {1,2,3,4,5,6,7,8,9,15};
		int moy = 6;
		
		assertEquals(moy, Tableaux.moyenne(tab), 0);
	}
	
	@Test
	public void fouilleSeq(){
		int[] tab = {1,3,213,12,313,15,34,346,51,343};
		int fouille = 5;
		
		assertEquals(fouille, Tableaux.fouilleSeq(tab,313));
	}
}