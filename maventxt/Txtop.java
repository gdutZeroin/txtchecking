package maventxt;

import java.io.IOException;
import java.io.FileWriter;
import java.io.File;


public class Txtop { 
	public static void output(double str,String s1,String s2) {
		//例如str为70，返回相似度为70%，且生成结果文件
	    //提取文件名
		String filePath1 = s1;
		String fileName1 = filePath1.substring(filePath1.lastIndexOf("\\")+1);
		String name1 = fileName1.substring(0,fileName1.lastIndexOf("."));
    
		String filePath2 = s2;
		String fileName2 = filePath2.substring(filePath2.lastIndexOf("\\")+1);
		String name2 = fileName2.substring(0,fileName2.lastIndexOf("."));		

		String fileName=(name1+"And"+name2+"_result"+".txt");
		String Stringstr=String.format("%.2f", str);

	//新建一个文件对象，如果不存在则创建一个该文件	
	File f=new File(fileName);
	//写入文件
	try {
		FileWriter fw=new FileWriter(f);
		fw.write(Stringstr);
		fw.close();
	} 
	catch (IOException e) { e.printStackTrace(); }
	
    System.out.println(f.getAbsolutePath());//获取绝对路径

}
}

