package maventxt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Txtip {
	public static String input(String path){
	//输入文本路径，返回字符串
	String str = "";
	String strL;
	//文件操作
	File file = new File(path);
	FileInputStream fileInput = null;
	try {
	    fileInput = new FileInputStream(file);
	    InputStreamReader inputStreamReader = new InputStreamReader(fileInput, "UTF-8");
	    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	    // 字符串拼接
	    while ((strL = bufferedReader.readLine()) != null) {
	        str += strL;
	    }
	// 关闭资源
	    inputStreamReader.close();
	    bufferedReader.close();
	    fileInput.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}  
	return str ; 
}
	
}

