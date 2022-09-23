package maventxttext;

import static org.junit.Assert.*;

import org.junit.Test;

import maventxt.Txtip;

public class TxtipTest {

	@Test
	public void test() {
		
		String str1=Txtip.input("D:\\txt\\orig.txt"); 
	    String str2=Txtip.input("D:\\txt\\orig_0.8_add.txt"); 
	    System.out.println(str1);
	    System.out.println(str2);
	    //D:\\txt\\orig.txt
	    //D:\\txt\\orig_0.8_add.txt
	    //D:\\txt\\orig_0.8_del.txt
	    //D:\\txt\\orig_0.8_dis_1.txt
	    //D:\\txt\\orig_0.8_dis_10.txt
	    //D:\\txt\\orig_0.8_dis_15.txt
	}

}
