package maventxt;

import java.security.MessageDigest;
import java.util.List;
import com.hankcs.hanlp.HanLP;
import java.math.BigInteger;


public class  Calcsimhash {
	
	
	public static String getHash(String str){
		//当try语句当中捕获到异常时，会将异常抛出到catch语句中匹配异常类型，当异常和catch后面的异常类型相匹配时，则catch语句将会执行。
        try{
            //MD5获取hash值
            MessageDigest messageDigest=MessageDigest.getInstance("MD5");
            //BigInteger大整数类
            return new BigInteger(1, messageDigest.digest(str.getBytes("UTF-8"))).toString(2);
        }catch(Exception e){
            e.printStackTrace();
            return str;
        }
    }
	
	
	public static String getSimhash(String str)
	{
		//1.取词：对文本的分词得到关键词
		List<String> keywordList = HanLP.extractKeyword(str, str.length());//取出所有关键词
        int[] arr = new int[128];// 用数组表示特征向量128
        int size = keywordList.size();//关键词大小
        // 2、获取hash值:调用gethash函数
        int i = 0;//以i做外层循环
        for(String keyword : keywordList){
            String keywordHash = getHash(keyword);
            if (keywordHash.length() < 128) {
                // hash值补齐
                int comple = 128 - keywordHash.length();
                for (int j = 0; j < comple; j++) {
                    keywordHash += "0";
                }
     }
        // 3、加权
        for (int j = 0; j < arr.length; j++) {
                if (keywordHash.charAt(j) == '1') {//返回指定索引处的字符与与'1'进行比较
                    //10等权重
                    arr[j] = arr[j] +(10 - (i / (size / 10)));
                } else {
                    arr[j] = arr[j] -(10 - (i / (size / 10)));
                }
            }
            i++;
        }   
        // 4、降维
        String simHash = "";// 储存返回的simHash值
        for (int j = 0; j < arr.length; j++) {
            //二维化，小于等于0为1，其余为1
        	if (arr[j]<=0) {
                simHash+="0";
            } else {
                simHash+="1"; 
            }
        }
        return simHash;    
            
	}
}
