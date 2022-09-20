package txt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class textip {
	public static String input(String txtpath){
/*	String str = "";
	String strLine;
	// 将 txt文件按行读入 str中
	System.out.println("请输入文本原件");
	Scanner in = new Scanner(System.in);
	String s = in.next();// D:/txt/orig.txt
*/	
	//System.out.println(s);
	String str = "";
	String strLine;
	
	File file = new File(txtpath);
	FileInputStream fileInputStream = null;
	try {
	    fileInputStream = new FileInputStream(file);
	    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
	    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	    // 字符串拼接
	    while ((strLine = bufferedReader.readLine()) != null) {
	        str += strLine;
	    }
	    // 关闭资源
	    inputStreamReader.close();
	    bufferedReader.close();
	    fileInputStream.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}  
	return str ; 
}
	
}

