package txt;
import java.util.Scanner;

public class mainchecking {

	public static void main(String[] args) {
//System.out.println("123");
//String str1="dasdd我是";
//System.out.println(str1);
		System.out.println("请输入文本1和文本2的绝对路径");
		Scanner sc = new Scanner(System.in); // 定义扫描键盘输入的对象
		String s1 = sc.nextLine(); // 从键盘读入一行文本
		String s2=sc.nextLine();
		sc.close();
		//
		System.out.println(s1);
		System.out.println(s2);
		//
		String str1=textip.input(s1); //D:/txt/orig.txt
	    String str2=textip.input(s2); 
	    //D:/txt/orig_0.8_add.txt
	    //D:/txt/orig_0.8_dis_1.txt
	    
	    
	    String simHash0=calcsimhash.getSimhash(str1);
        String simHash1=calcsimhash.getSimhash(str2);
        //       
        System.out.println(simHash0);
		System.out.println(simHash1);
		//
		double smlar = similarity.getSimilarity(simHash0, simHash1);
		System.out.println(smlar);
		
		//
		String Stringsmlar = String.valueOf(smlar);
		txtop.output(Stringsmlar);
		
	}
}