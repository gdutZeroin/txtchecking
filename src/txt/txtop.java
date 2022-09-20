package txt;

import java.io.IOException;

import java.io.FileWriter;
import java.io.File;

public class txtop { 
	public static void output(String str) {
	File f=new File("D:/txt/outcome.txt");
	//新建一个文件对象，如果不存在则创建一个该文件
	
	FileWriter fw;

	try {

	fw=new FileWriter(f);


	fw.write(str);//将字符串写入到指定的路径下的文件中

	fw.close();
    	 
	} 
	catch (IOException e) { e.printStackTrace(); }
	
	String report="写入文件成功(D:/txt/outcome.txt)";	 
	System.out.println(report);
}

}
	

