package maventxt;

public class Mainchecking {

	public static void main(String[] args) {
		/*
		System.out.println("请输入原文绝对路径");
		// 定义扫描键盘输入的对象
		Scanner sc = new Scanner(System.in);
		// 从键盘读入一行文本
		String s1 = sc.nextLine(); 
		System.out.println("请输入测试文本绝对路径");
		String s2=sc.nextLine();
		sc.close();
		*/
		String str1=Txtip.input(args[0]); 
	    String str2=Txtip.input(args[1]); 
	    //D:\\txt\\orig.txt
	    //D:\\txt\\orig_0.8_add.txt
	    //D:\\txt\\orig_0.8_del.txt
	    //D:\\txt\\orig_0.8_dis_1.txt
	    //D:\\txt\\orig_0.8_dis_10.txt
	    //D:\\txt\\orig_0.8_dis_15.txt

	    //获取simHash值
	    String simHash0=Calcsimhash.getSimhash(str1);
        String simHash1=Calcsimhash.getSimhash(str2);
        
		//获取相似度值
		double smlar = Similarity.getSimilarity(simHash0, simHash1);
		
		Txtop.output(smlar,args[0],args[1]);
		
	}
}