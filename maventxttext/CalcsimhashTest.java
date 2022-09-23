package maventxttext;

import static org.junit.Assert.*;

import org.junit.Test;

import maventxt.Calcsimhash;
import maventxt.Txtip;

public class CalcsimhashTest {

	@Test
	public void test() {
		String str1=Calcsimhash.getHash("广东工业大学属于广东高校,而且是广州高校");
		System.out.println(str1);
        
		String str2=Txtip.input("D:\\txt\\orig.txt"); 
		String simHash0=Calcsimhash.getSimhash(str2);
		System.out.println(simHash0);

}
}
