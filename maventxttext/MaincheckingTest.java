package maventxttext;

import static org.junit.Assert.*;

import org.junit.Test;

import maventxt.Mainchecking;

public class MaincheckingTest {

	@Test
	public void test() {
		Mainchecking mainchecking=new Mainchecking();
		String[] s=new String[6];
		s[0]="D:\\txt\\orig.txt";
		s[1]="D:\\\\txt\\\\orig_0.8_add.txt";
		/*s[0]="D:\\txt\\orig.txt";
		s[1]="D:\\\\txt\\\\orig_0.8_del.txt";
		*/
		/*s[0]="D:\\txt\\orig.txt";
		s[1]="D:\\\\txt\\\\orig_0.8_dis_1.txt";
		*/
		/*
		s[0]="D:\\txt\\orig.txt";
		s[1]="D:\\\\txt\\\\orig_0.8_dis_10.txt";
		*/
		/*
		s[0]="D:\\txt\\orig.txt";
		s[1]="D:\\\\txt\\\\orig_0.8_dis_15.txt";
		*/	
		mainchecking.main(s);
	}
	
	}

