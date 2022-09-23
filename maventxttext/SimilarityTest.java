package maventxttext;

import static org.junit.Assert.*;

import org.junit.Test;

import maventxt.Calcsimhash;
import maventxt.Similarity;
import maventxt.Txtip;
import maventxt.Txtop;

public class SimilarityTest {

	@Test
	public void test() {
		String str1=Txtip.input("D:\\txt\\orig.txt"); 
	    String str2=Txtip.input("D:\\\\txt\\\\orig_0.8_add.txt"); 
	    String simHash0=Calcsimhash.getSimhash(str1);
        String simHash1=Calcsimhash.getSimhash(str2);
        double smlar = Similarity.getSimilarity(simHash0, simHash1);
        System.out.println(smlar);
        
	}

}
